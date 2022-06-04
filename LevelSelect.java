import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LevelSelect extends JFrame
{
	
	public LevelSelect()
	{
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setResizable(false);
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		JButton level1 = new JButton("1");
		JButton spacer1 = new JButton("             ");
		spacer1.setVisible(false);
	    JButton level2 = new JButton("2");
	    JButton spacer2 = new JButton("             ");
		spacer2.setVisible(false);
	    JButton level3 = new JButton("3");
	    JButton spacer3 = new JButton("             ");
		spacer3.setVisible(false);
	    JButton level4 = new JButton("4");
	    JButton spacer4 = new JButton("             ");
		spacer4.setVisible(false);
	    JButton level5 = new JButton("5");
	    JButton level6 = new JButton("6");
	    JButton spacer5 = new JButton("             ");
		spacer5.setVisible(false);
	    JButton level7 = new JButton("7");
	    JButton spacer6 = new JButton("             ");
		spacer6.setVisible(false);
	    JButton level8 = new JButton("8");
	    JButton spacer7 = new JButton("             ");
		spacer7.setVisible(false);
	    JButton level9 = new JButton("9");
	    JButton spacer8 = new JButton("             ");
		spacer8.setVisible(false);
	    JButton level10 = new JButton("10");
	   
	  
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    this.add(level1, gbc);
	    gbc.gridx = 1;
	    this.add(spacer1, gbc);
	    gbc.gridx = 2;
	    this.add(level2, gbc);
	    gbc.gridx = 3;
	    this.add(spacer2, gbc);
	    gbc.gridx = 4;
	    this.add(level3, gbc);
	    gbc.gridx = 5;
	    this.add(spacer3, gbc);
	    gbc.gridx = 6;
	    this.add(level4, gbc);
	    gbc.gridx = 7;
	    this.add(spacer4, gbc);
	    gbc.gridx = 8;
	    this.add(level5, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    this.add(level6, gbc);
	    gbc.gridx = 1;
	    this.add(spacer5, gbc);
	    gbc.gridx = 2;
	    this.add(level7, gbc);
	    gbc.gridx = 3;
	    this.add(spacer6, gbc);
	    gbc.gridx = 4;
	    this.add(level8, gbc);
	    gbc.gridx = 5;
	    this.add(spacer7, gbc);
	    gbc.gridx = 6;
	    this.add(level9, gbc);
	    gbc.gridx = 7;
	    this.add(spacer8, gbc);
	    gbc.gridx = 8;
	    this.add(level10, gbc);
	   
	    
	    level1.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			 try {
					new Stage(1);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    			 
    		}

    	});
	    
	    level2.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			 try {
					new Stage(2);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    			 
    		}

    	});
	    
	    level3.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			 try {
					new Stage(3);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    			 
    		}

    	});
	    
	    level4.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			 try {
					new Stage(4);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    			 
    		}

    	});
	    
	    level5.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			 try {
					new Stage(5);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    			 
    		}

    	});
	    
	    level6.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			 try {
					new Stage(6);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    			 
    		}

    	});
	    level7.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			 try {
					new Stage(7);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    			 
    		}

    	}); 
	    
	    level8.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			 try {
					new Stage(8);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    			 
    		}

    	});
    	
    	 level9.addActionListener(new ActionListener()
     	{
     		public void actionPerformed(ActionEvent e)
     		{
     			 try {
 					new Stage(9);
 				} catch (IOException e1) {
 					// TODO Auto-generated catch block
 					e1.printStackTrace();
 				}
     			 
     		}

     	});
	    
    	 level10.addActionListener(new ActionListener()
     	{
     		public void actionPerformed(ActionEvent e)
     		{
     			 try {
 					new Stage(10);
 				} catch (IOException e1) {
 					// TODO Auto-generated catch block
 					e1.printStackTrace();
 				}
     			 
     		}

     	});
	    
	    this.setTitle("Level Select");
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	    
		
	}
	

	public static void main(String args[])
	{
		new LevelSelect();
	}
}
