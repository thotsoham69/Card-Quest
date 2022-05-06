import java.util.ArrayList;

public class Enemies {


	private int health;
	private String name;
	private int healthStat;
	private int attackStat;
	private ArrayList<Action> rotation;
	
	public int getHealth()
	{
		return health;
	}
	
	public int getAttackStat()
	{
		return attackStat;
	}
	
	
	public int takeDamage(int damage)
	{
		health = health - damage;
		if(health <= 0)
		{
			die();
			return health;
		}
		
		return health;
		
	}
	
	public void die()
	{
		
	}
	
	public int dealDamage(int damage, Hero hero)
	{
		 return hero.takeDamage(damage);
		 
	}
	
}
