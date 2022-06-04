import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LevelSelect extends JFrame
{
	
	public LevelSelect()
	{
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setResizable(false);
		this.setLayout(new GridLayout(4, 4));
		GridBagConstraints gbc = new GridBagConstraints();
		ImageIcon fields = new ImageIcon("Fields.jpg");
		ImageIcon caves = new ImageIcon("Caves.jpg");
		ImageIcon forest = new ImageIcon("Forest.jpg");
		ImageIcon desert = new ImageIcon("Desert.jpg");
		ImageIcon beach =  new ImageIcon("Beach.jpg");
		ImageIcon island = new ImageIcon("Island.jpg");
		ImageIcon canyon = new ImageIcon("Canyon.jpg");
		ImageIcon mountain = new ImageIcon("Mountains.jpg");
		ImageIcon frost = new ImageIcon("Frost.jpg");
		ImageIcon volc = new ImageIcon("Volcano.jpg");
		
		JButton level1 = new JButton("", fields);
		level1.setRolloverIcon(fields);
	
	    JButton level2 = new JButton("", caves);
	    level2.setRolloverIcon(caves);
		
	    JButton level3 = new JButton("", forest);
	    level3.setRolloverIcon(forest);
	    
	    JButton level4 = new JButton("", desert);
	    level4.setRolloverIcon(desert);
	    
	    JButton level5 = new JButton("", beach);
	    level5.setRolloverIcon(beach);
	    
	    JButton level6 = new JButton("", island);
	    level6.setRolloverIcon(island);
	    
	    JButton level7 = new JButton("", canyon);
	    level7.setRolloverIcon(canyon);
	    
	    JButton level8 = new JButton("", mountain);
	    level8.setRolloverIcon(mountain);
	    
	    JButton level9 = new JButton("", frost);
	    level9.setRolloverIcon(frost);
	    
	    JButton Spacer = new JButton("");
	    Spacer.setEnabled(false);
	    
	    JButton level10 = new JButton("", volc);
	    level10.setRolloverIcon(volc);
	    
	    JButton Spacer2 = new JButton("");
	    Spacer2.setEnabled(false);
	  
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    this.add(level1, gbc);
	    gbc.gridx = 1;
	   
	    gbc.gridx = 2;
	    this.add(level2, gbc);
	    gbc.gridx = 3;
	   
	    gbc.gridx = 4;
	    this.add(level3, gbc);
	    gbc.gridx = 5;
	   
	    gbc.gridx = 6;
	    this.add(level4, gbc);
	    gbc.gridx = 7;
	
	    gbc.gridx = 8;
	    this.add(level5, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    this.add(level6, gbc);
	    gbc.gridx = 1;
	 
	    gbc.gridx = 2;
	    this.add(level7, gbc);
	    gbc.gridx = 3;

	    gbc.gridx = 4;
	    this.add(level8, gbc);
	    gbc.gridx = 5;
	
	    gbc.gridx = 6;
	    this.add(level9, gbc);
	    gbc.gridx = 7;
	 
	    this.add(Spacer);
	    
	    gbc.gridx = 8;
	    this.add(level10, gbc);
	   
	    this.add(Spacer2);
	    
	    
	    level1.addActionListener(new ActionListener()
    	{
	    	
    		public void actionPerformed(ActionEvent e)
    		{
    			
    			 try {
					new Stage(1);
					dispose();
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
					dispose();
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
					dispose();
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
					dispose();
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
					dispose();
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
					dispose();
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
					dispose();
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
					dispose();
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
 					dispose();
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
 					dispose();
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
