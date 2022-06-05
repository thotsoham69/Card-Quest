import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Slime extends Enemies 
{
	
	private String nextMove;
	private ArrayList<String> rotation;
	public Slime(int healthStat, int attackStat, int reward) {
		super(healthStat, attackStat, reward);
		rotation = new ArrayList<String>();
		rotation.add("Attack");
		rotation.add("Attack");
		rotation.add("Heal");
		rotation.add("Heal");
		rotation.add("Shield");
		rotation.add("specialAttack");
		rotation.add("specialAttack");
		nextMove = rotation.get(0);
	}
	
	public void TakeAction(Hero hero)
	{
		
		switch(nextMove)
		{
			case "Attack":
				int att = getAttackStat();
				hero.takeDamage(getAttackStat());
				JOptionPane.showConfirmDialog(null, "the Slime attacked for " + att + " damage!", "Attacked!", JOptionPane.PLAIN_MESSAGE);
				break;
				
			case "Shield":
				int shield = this.getOHealth()/3;
				this.shield(shield);
				JOptionPane.showConfirmDialog(null, "the Slime Shielded itself by " + shield + " points", "Shielded", JOptionPane.PLAIN_MESSAGE);
				break;
				
			case "Heal":
				this.heal(this.getOHealth()/4);
				JOptionPane.showConfirmDialog(null, "the Slime healed itself by  " + this.getOHealth()/4 + " health", "Healed", JOptionPane.PLAIN_MESSAGE);
				break;
				
			case "specialAttack":
				this.shield(hero.getShield());
				int attk = (this.getAttackStat() + hero.getShield());
				int atte = this.getAttackStat();
				hero.takeDamage(attk);
				JOptionPane.showConfirmDialog(null, "the Slime stole your shield and dealt  " + atte + " damage", "Special Attack", JOptionPane.PLAIN_MESSAGE);
		}
		
		nextMove = rotation.get((int)(Math.random() * rotation.size()));
	}
	
	public String getNextMove()
	{
		return nextMove;
	}


}
