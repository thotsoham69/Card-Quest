	
	import java.awt.*;
import java.io.File;

import javax.swing.*; 
	

public class Game extends JFrame 
{
	
	@SuppressWarnings("serial")
	public Game(String back, String MonsterPIC, int MonsterWidth, int MonsterHeight, Hero hero, Enemies enemy)
	{
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JLabel contentPane = new JLabel();
		ImageIcon backy = new ImageIcon(back);
		
		contentPane.setIcon(resizeIcon(backy, 1600, 900));
		contentPane.setLayout(new BorderLayout());
	  
	    this.setContentPane(contentPane);
	    
	    ImageIcon icon = new ImageIcon(MonsterPIC); 
	    JLabel label = new JLabel(); 
	    
	    label.setIcon(resizeIcon(icon, MonsterWidth, MonsterHeight)); 
	    this.add(label);
	    label.setHorizontalAlignment(JLabel.RIGHT);
	    label.setVerticalAlignment(JLabel.TOP);
	    
	    JButton read1 = new JButton("Read Effect");
	    JButton read2 = new JButton("Read Effect");
	    JButton read3 = new JButton("Read Effect");
	    JButton use1 = new JButton("Use Card");
	    JButton use2 = new JButton("Use Card");
	    JButton use3 = new JButton("Use Card");
	    
	    JPanel card1 = new JPanel();
	    card1.add(read1);
	    card1.add(use1);
	    
	    
	    Dimension d1 = new Dimension(30, 50);
	    card1.setPreferredSize(d1);
	    card1.setBackground(hero.getDeck().getDeck().get(0).getColor());
	    hero.getDeck().draw();
	    
	    JPanel card2 = new JPanel();
	    card2.add(read2);
	    card2.add(use2);
	    card2.setBackground(hero.getDeck().getDeck().get(1).getColor());
	    
	    JPanel card3 = new JPanel();
	    card3.add(read3);
	    card3.add(use3);
	    card3.setBackground(hero.getDeck().getDeck().get(2).getColor());
	    
	    
	    play();
	    
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
	
	public void play(Hero hero, Enemies enemy, JPanel card1, JPanel card2, JPanel card3)
	{
		
		
	}
	
	
	
	public static void main (String args[])
	{
		new Game("Volcano.jpg", "GreenDragon.png", 500, 450);
	}
	
}
