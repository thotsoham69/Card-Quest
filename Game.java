	
	import java.awt.*; 
	import javax.swing.*; 
	

public class Game extends JFrame 
{
	
	public Game()
	{
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JLabel contentPane = new JLabel();
		ImageIcon backy = new ImageIcon("Fields.jpg");
		
		contentPane.setIcon(resizeIcon(backy, 1600, 900));
		contentPane.setLayout(new BorderLayout());
	  
	    this.setContentPane(contentPane);
	    
	    ImageIcon icon = new ImageIcon("GreenDragon.png"); 
	    JLabel label = new JLabel(); 
	    
	    label.setIcon(resizeIcon(icon, 500, 450)); 
	    this.add(label);
	    label.setHorizontalAlignment(JLabel.RIGHT);
	    label.setVerticalAlignment(JLabel.TOP);
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
		new Game();
	}
	
}
