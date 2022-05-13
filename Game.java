	
	import java.awt.*;
import java.io.File;
import java.util.ArrayList;

import javax.swing.*; 
	

public class Game extends JFrame 
{
	
	@SuppressWarnings("serial")
	public Game(String back, String MonsterPIC, int MonsterWidth, int MonsterHeight, Hero hero, Enemies enemy)
	{
		//starts game with full screen
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
	   
	    //panel to hold all above componenets and card panels
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
        
        hand.setOpaque(false);
        
	    
	    //regular stuff for frame
	    this.setBounds(10,10,600,400);
		this.setTitle("Card quest");
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	}
	public ImageIcon resizeIcon(ImageIcon icon, int width, int height)
	{
		Image image = icon.getImage();
	    Image newimg = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
	    ImageIcon newImageIcon = new ImageIcon(newimg);
	    return newImageIcon;
	}
	
	
	
	
	
	public static void main (String args[])
	{
		
		new Game("Volcano.jpg", "GreenDragon.png", 500, 450, new Hero("Ani", 5, 20, 0), new BrownDragon("Mountain Dragon", 120, 20, 100));
	}
	
}
