import java.util.ArrayList;

public class Enemies {


	private int health;
	private String name;
	private int healthStat;
	private int attackStat;
	private int reward;
	public Enemies(String name, int healthStat, int attackStat, int reward)
	{
		this.health = healthStat;
		this.name = name;
		this.healthStat = healthStat;
		this.attackStat = attackStat;
		this.reward = reward;
			
	}
	
	public int getHealth()
	{
		return healthStat;
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
	
	public void dealDamage(int damage, Hero hero)
	{
		  hero.takeDamage(damage);
		 
	}
	
	public void buff(int buff)
	{
		attackStat += buff;
	}
	
	public void heal(int heal)
	{
		health += heal;
		if (health > healthStat)
		{
			health = healthStat;
		}
	}
	
	public void debuff(int debuff)
	{
		attackStat-= debuff;
	}
	
}
