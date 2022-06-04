import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Stage 
{
	private Hero hero;
	private Enemies enemy;
    private Game game;
    private boolean firstTime = false;
    private static File file = new File("SaveFile.txt");
	@SuppressWarnings("unused")
	public Stage(int level) throws IOException
	
	{
		
		
		FileNotFoundException FileNotFound = new FileNotFoundException();
		
		try
		{
			 boolean exists = file.exists();
			 if(!exists)
			 {
				 String name = JOptionPane.showInputDialog(null, "What is your name?");
				 hero = new Hero(name, 5, 20, 0);
				 hero.getDeck().getDeck().add(new AttackCard());
				 hero.getDeck().getDeck().add(new AttackCard());
				 hero.getDeck().getDeck().add(new AttackCard());
				 hero.getDeck().getDeck().add(new ShieldCard());
				 hero.getDeck().getDeck().add(new ShieldCard());
				 hero.getDeck().getDeck().add(new ShieldCard());
				 firstTime = true;
				 throw FileNotFound ; 
			 }
		}
		
		catch(Exception FileNotFoundException)
		{
			file.createNewFile();
			PrintWriter writer = new PrintWriter(file);
			writer.print(hero.getName() + "/" + hero.getHealthStat() + "/" + hero.getOAttack() + "/" + hero.getGold() + "/");

			 
			for(int i = hero.getFullDeckList().size() - 1 ; i >= 0 ; i--)
			{
		
				writer.print(hero.getFullDeckList().get(i).getName() + "/");
		
			}
				writer.close();

		}
		
		 
		
	if(!firstTime)
	{
		ArrayList<String> txt = new ArrayList<String>();
		txt = this.txtToList(file);
		String[] split = txt.get(0).split("/");
		hero = new Hero(split[0], Integer.parseInt(split[2]), Integer.parseInt(split[1]),Integer.parseInt(split[3]));
		for(int i = 4; i < split.length ; i++)
		{
			if(split[i].equals("Attack"))
			{
				hero.getDeck().getDeck().add(new AttackCard());
			}
			
			else if(split[i].equals("Shield"))
			{
				hero.getDeck().getDeck().add(new ShieldCard());
			}
			
			
			
		}
		
	}
	

		
		if(level == 1)
		{
			enemy = new Goblin(10, 3, 5);
			game = new Game("Fields.jpg", "Goblin.png", 500, 450, hero, enemy);
			save(hero);
		}
		
		
		if(level == 2)
		{
		
			enemy = new Goblin(10, 3, 5);
			game = new Game("Fields.jpg", "BlueSlime.png", 500, 450, hero, enemy);
			save(hero);
		}
	}
	
	public static void save(Hero hero) throws IOException
	{

				
		PrintWriter writer = new PrintWriter("SaveFile.txt"); 
		 writer.print(hero.getName() + "/" + hero.getHealthStat() + "/" + hero.getOAttack() + "/" + hero.getGold() + "/");
		 
		for(int i = hero.getFullDeckList().size() - 1 ; i >= 0 ; i--)
		{
			
			writer.print(hero.getFullDeckList().get(i).getName() + "/");
			
		}
		
		writer.close();
		
	}
	
	public ArrayList<String> txtToList(File fileparam) throws IOException
	{
		ArrayList<String> storage = new ArrayList<String>();
		Scanner s = new Scanner(fileparam);
		while (s.hasNextLine())
		{
			
			try
			{
				storage.add(s.next());
			}
			catch(Exception e) {}
			
		}
		s.close();
		return storage;
	}
}


