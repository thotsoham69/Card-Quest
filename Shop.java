import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Shop extends JFrame
{

	
	
	
	
	public Shop(Hero hero)
	{
		
	JMenuBar menuBar = new JMenuBar();
    JMenuItem Back = new JMenuItem("Return");
    menuBar.add(Back);
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
    
    Back.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			
			
		}

	});
    
    
	this.setResizable(false);
	this.setTitle("Shop");
	this.setVisible(true);
	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	
	}


		
}
