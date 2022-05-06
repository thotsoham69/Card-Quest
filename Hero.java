
public class Hero 
{

	private int health;
	private String name;
	private int healthStat;
	private int attackStat;
	private Deck deck;
	
	public Hero(int healthStat, String name, int attackStat, Deck deck)
	{
		this.healthStat = healthStat;
		this.name = name;
		this.attackStat = attackStat;
		this.deck = deck;
		health = healthStat;
	}
	
	public int takeDamage(int damage)
	{
		health = health - damage;
		if(health <= 0)
		{
			die();
		}
		return health;
	}
	
    public void dealDamage(int damage, Enemies enemy)
    {
    	
    	enemy.takeDamage(damage);
    	
    }

	private void die() 
	{
	
		
	}

	
}
