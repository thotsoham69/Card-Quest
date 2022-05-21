	
	import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.*; 
	

public class Game extends JFrame 
{
	private File file = new File("SaveFile.txt");
	private Hero hero;
	private Enemies enemy;
	private int level;
	@SuppressWarnings("serial")
	public Game(String back, String MonsterPIC, int MonsterWidth, int MonsterHeight, Hero hero, Enemies enemy) throws IOException
	{
		
		//starts game with full screen
		
		this.hero = hero;
		this.enemy = enemy;
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
		JLabel contentPane = new JLabel();
		ImageIcon backy = new ImageIcon(back);
		
		contentPane.setIcon(resizeIcon(backy, 1600, 900));
		contentPane.setLayout(new BorderLayout());
        
		
	    this.setContentPane(contentPane);
	    ImageIcon icon = new ImageIcon(MonsterPIC); 
	    JLabel label = new JLabel(); 
	    
	    label.setIcon(resizeIcon(icon, MonsterWidth, MonsterHeight)); 
	    this.add(label, BorderLayout.NORTH);
	    
	    label.setHorizontalAlignment(label.RIGHT);
	    
	    //click to read effect of each of the three cards in hand
	    JButton read1 = new JButton("Read Effect");
	    JButton read2 = new JButton("Read Effect");
	    JButton read3 = new JButton("Read Effect");
	    
	    // click to use each card in hand
	    JButton use1 = new JButton("Use Card");
	    JButton use2 = new JButton("Use Card");
	    JButton use3 = new JButton("Use Card");
	   
	    //panel to hold all above components and card panels
	    JPanel hand = new JPanel();
	    
	    this.add(hand, BorderLayout.SOUTH);
	    
	    
	    //creating each card and adding the respective read and use buttons to each
	    JPanel card1 = new JPanel();
	    card1.add(read1);
	    card1.add(use1);
	    card1.setBackground(hero.getDeck().getDeck().get(0).getColor());
	    
	    
		
	    JPanel card2 = new JPanel();
	    card2.add(read2);
	    card2.add(use2);
	    card2.setBackground(hero.getDeck().getDeck().get(0).getColor());
	    
	    
	    JPanel card3 = new JPanel();
	    card3.add(read3);
	    card3.add(use3);
	    card3.setBackground(hero.getDeck().getDeck().get(0).getColor());
	    hero.getDeck().draw();
	   
	  //End- ends turn, Energy- displays available energy, Deck- displays cards in deck, Discard - displays cards in discard pile
	    JButton End = new JButton("End Turn");
	    JLabel Energy = new JLabel("Energy: "+ hero.getEnergy());
	    JLabel Deck = new JLabel("Deck: " + hero.getDeck().getDeck().size());
	    JLabel Discard = new JLabel("Discarded: "+ hero.getDeck().getDiscard().size());
	    
	    //adding components in order from left to right to the Hand Panel
	    hand.setPreferredSize(new Dimension(300, 80));
	    
	    hand.add(Deck);
	    
	    hand.add(Discard);
	    
	    hand.add(card1);
	   
        hand.add(card2);
   
        hand.add(card3);
        
        hand.add(Energy);
       
        hand.add(End);
        
        
        JMenuBar menuBar = new JMenuBar();
        JMenu Options = new JMenu("Options");
        JMenuItem Save = new JMenuItem("Save");
        JMenuItem Shop = new JMenuItem("Shop");
        JMenuItem Stats = new JMenuItem("Stats");
        JMenuItem SaveClose = new JMenuItem("Save and Close");
        
        Options.add(Save);
        
        Options.add(SaveClose);
        
        Options.add(Shop);
        
        Options.add(Stats);
        
        
	    menuBar.add(Options);
	    
        this.setJMenuBar(menuBar);
        
        JPanel healthPanel = new JPanel();
        healthPanel.setLayout(new BorderLayout());
        healthPanel.setOpaque(false);
        this.add(healthPanel, BorderLayout.CENTER);
        
        JLabel healthEnemy = new JLabel(enemy.getHealth() + "/" + enemy.getHealth());
        
        healthPanel.add(healthEnemy, BorderLayout.NORTH);
        healthEnemy.setHorizontalAlignment(healthEnemy.RIGHT);
        
        //Actions:
        
        
        Stats.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			JOptionPane.showMessageDialog(null, "Attack: " + hero.getAttackStat() + "\n" + "Health: " + hero.getHealth() + "/" + hero.getHealthStat() + "\n" + "Gold: " + hero.getGold() + "\n" + "Reward: " + enemy.getReward());
    			
    		}

    	});
        
        Save.addActionListener(new ActionListener()
       	{
       		public void actionPerformed(ActionEvent e)
       		{
       			try {
					save(hero, level);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
       			
       		}

       	});
        
        SaveClose.addActionListener(new ActionListener()
       	{
       		public void actionPerformed(ActionEvent e)
       		{
       			try {
					save(hero, level);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
       			dispose();
       		}

       	});
        
        Shop.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			int confirm = JOptionPane.showConfirmDialog(null, "are you sure?, If you go to the shop now you will lose your progresss against this monster");
    			
    			if(confirm == 0)
    			{
    				try {
						save(hero, level);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
    				dispose();
    				new Shop(hero);
    				
    			}
    		}

    	});
        
        
	    //regular stuff for frame
		this.setTitle("Card quest");
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	}
	
	public ImageIcon resizeIcon(ImageIcon icon, int width, int height)
	{
		
		Image image = icon.getImage();
	    Image newimg = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
	    ImageIcon newImageIcon = new ImageIcon(newimg);
	    return newImageIcon;
	    
	    
	}
	
	    
	public void save(Hero hero, int level) throws IOException
	{
		//creates Save file if not already created
				FileNotFoundException FileNotFound = new FileNotFoundException();
				
				try
				{
					 boolean exists = file.exists();
					 if(!exists)
					 {
						 throw FileNotFound ; 
					 }
				}
				
				catch(Exception FileNotFoundException)
				{
					file.createNewFile();
				}
				
		PrintWriter writer = new PrintWriter("SaveFile.txt"); 
		 writer.println(hero.getName() + "/" + hero.getHealthStat() + "/" + hero.getOAttack() + "/" + hero.getGold() + "/");
		 
		for(int i = hero.getFullDeckList().size() - 1 ; i >= 0 ; i--)
		{
			
			writer.print(hero.getFullDeckList().get(i) + "/");
			
		}
		
	}
	
	public void GameLoad (int level, String name, int Atk, int health, int gold) throws IOException
	{
		switch(level)
		{
		 
		case 1: 
			Hero hero = new Hero(name, Atk, health, gold);
			Goblin goblin = new Goblin("Mountain Dragon", 120, 20, 100);
			level = 1;
			new Game("Fields.jpg", "Goblin.png", 500, 450, hero , goblin);
		
		case 2:
			
			level = 2;
			
			
			
		}
		
	}
	
	
	
	
	
	public Enemies getEnemy()
	{
		return enemy;
	}
	
	public Hero getHero()
	{
		return hero;
	}
	
	public static void main (String args[]) throws IOException
	{
		Hero hero = new Hero("Ani", 5, 20, 0);
		BrownDragon dragon = new BrownDragon("Mountain Dragon", 120, 20, 100);
		new Game("Fields.jpg", "GreenDragon.png", 500, 450, hero , dragon);
	}
	
}
