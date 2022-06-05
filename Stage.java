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
    
    public Stage()
    {
    	
    }
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
			enemy = new Goblin(30, 7, 20);
			game = new Game("Fields.jpg", "Goblin.png", 500, 450, hero, enemy);
			save(hero);
		}
		
		
		if(level == 2)
		{
		
			enemy = new Slime(90, 20, 50);
			game = new Game("Caves.jpg", "BlueSlime.png", 500, 450, hero, enemy);
			save(hero);
		}
		
		if(level == 3)
		{
			enemy = new Goblin(150, 35, 170);
			game = new Game("Forest.jpg", "Golem.png", 550, 500, hero, enemy);
			save(hero);
		}
		
		
		if(level == 4)
		{
		
			enemy = new Goblin(270, 50, 300);
			game = new Game("Desert.jpg", "Mummy.png", 500, 550, hero, enemy);
			save(hero);
		}
		
		if(level == 5)
		{
			enemy = new Goblin(400, 75, 540);
			game = new Game("Beach.jpg", "Crab.png", 550, 400, hero, enemy);
			save(hero);
		}
		
		
		if(level == 6)
		{
		
			enemy = new Goblin(670, 90, 700);
			game = new Game("Island.jpg", "Tree.png", 400, 500, hero, enemy);
			save(hero);
		}
		
		if(level == 7)
		{
			enemy = new Goblin(790, 120, 850);
			game = new Game("Canyon.jpg", "Eagle.png", 550, 500, hero, enemy);
			save(hero);
		}
		
		
		if(level == 8)
		{
		
			enemy = new BrownDragon(900, 160, 1000);
			game = new Game("Mountains.jpg", "GreenDragon.png", 600, 550, hero, enemy);
			save(hero);
		}
		
		if(level == 9)
		{
			enemy = new Goblin(1000, 200, 1400);
			game = new Game("Frost.jpg", "SnowMan.png", 500, 500, hero, enemy);
			save(hero);
		}
		
		
		if(level == 10)
		{
		
			enemy = new Goblin(1500, 250, 2000);
			game = new Game("Volcano.jpg", "BlueSlime.png", 500, 450, hero, enemy);
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


