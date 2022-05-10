import java.io.File;
import java.util.ArrayList;

public class BrownDragon extends Enemies
{
    
	private File picture;
	Action action = new Action(this);
	public BrownDragon(int health, String name, int healthStat, int attackStat, ArrayList<String> rotation, File pic, int reward)
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
		
		
		
		picture = pic;
		
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
