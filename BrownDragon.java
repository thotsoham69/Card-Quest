import java.io.File;
import java.util.ArrayList;

public class BrownDragon extends Enemies
{
    
	
	private String nextMove;
	private ArrayList<String> rotation;
	Action action = new Action(this);
	public BrownDragon(String name, int healthStat, int attackStat, int reward)
	{
		super(name, healthStat, attackStat, reward);
		
		rotation = new ArrayList<String>();
		rotation.add("Attack");
		rotation.add("Debuff");
		rotation.add("Attack");
		rotation.add("splAttack");
		rotation.add("splAttack2");
		rotation.add("Heal");
		rotation.add("Debuff");
		
		
		
		
	}
	
	public void TakeAction(Hero hero)
	{
		if(rotation.indexOf(nextMove) + 1 < rotation.size())
			nextMove = rotation.get(rotation.indexOf(nextMove) + 1);
		else
			nextMove = rotation.get(0);

		switch(nextMove)
		{
			case "Attack":
				hero.takeDamage(getAttackStat());
			case "Debuff":
				hero.debuff("debuff", -hero.getAttackStat()/6);
			case "Heal":
				heal(this.getOHealth()/10);
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
	
	public String getNextMove()
	{
		return nextMove;
	}
	
	
	
}
