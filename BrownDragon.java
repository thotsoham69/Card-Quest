import java.io.File;
import java.util.ArrayList;

public class BrownDragon extends Enemies
{
    
	private File picture;
	private String nextMove;
	Action action = new Action(this);
	public BrownDragon(int health, String name, int healthStat, int attackStat, ArrayList<String> rotation, File pic, int reward)
	{
		super(name, healthStat, attackStat, reward);
		health = healthStat;
		rotation = new ArrayList<String>();
		rotation.add("Attack");
		rotation.add("Debuff");
		rotation.add("Attack");
		rotation.add("splAttack");
		rotation.add("splAttack2");
		rotation.add("Heal");
		rotation.add("Debuff");
		
		
		
		picture = pic;
		
	}
	
	public void TakeAction(Hero hero)
	{
		switch(nextMove)
		{
			case "Attack":
				hero.takeDamage(getAttackStat());
			case "Debuff":
				hero.debuff("debuff", -hero.getAttackStat()/6);
			case "Heal":
				heal(this.getHealth()/10);
			case "splAttack":
				specialAttack(hero);
			case "splAttack2" :
				specialAttack2(hero);
			
				
		}
	}
	public void specialAttack(Hero hero)
	{
		action.burn(hero, (int)(Math.random()*3) + 1, this.getAttackStat()/10);
		hero.takeDamage(this.getAttackStat()/2);
	}
    
	public void  specialAttack2(Hero hero)
	{
		int rand = (int)(Math.random() * 5) + 1;
		
		if(rand == 1)
		{
			action.burn(hero, 2, this.getAttackStat()/10);
		}
		
		if(rand == 2 || rand == 3)
		{
			hero.takeDamage(this.getAttackStat());
			this.heal(hero.getAttackStat());
		}
		
		if(rand == 4)
		{
			hero.takeDamage((rand - 1) * this.getAttackStat());
		}
		
		if(rand == 5)
		{
			hero.takeDamage(this.getAttackStat()*2);
		}
			
	}
	
	
	
	
}
