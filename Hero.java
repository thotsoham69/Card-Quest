

public class Hero 
{
	private int health;
	private String name;
	private int healthStat;
	private int OriginalA;
	private int attackStat;
	private Deck deck;
	private int gold;
	private int energy;
	private int DmgOT;
	private int turnsDMG;
	public Hero(String name, Deck deck, int AttackStat, int healthStat)
	{
		this.healthStat = healthStat; 
		this.name = name;
		OriginalA = AttackStat;
		this.attackStat = OriginalA;
		this.deck = deck;
		health = healthStat;
		this.gold = 0;
		this.energy = 5;
		
		 
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
	
	public void atStart()
	{
		energy += 5;
		if(DmgOT > 0 && turnsDMG > 0)
		{
			takeDamage(DmgOT);
			turnsDMG--;
		}
		
	}
    public void dealDamage(int damage, Enemies enemy)
    {
    	
    	enemy.takeDamage(damage);
    	
    }

    public void gainReward(int reward)
    {
    	gold+=reward;
    }
    
    public void debuff(String debuff, int de)
    {
    	switch (debuff)
    	{
    	case "lower" :
    		attackStat += de;
    	}
    }
    
	public void die() 
	{
	  
		
	}

	public void takeDamageOverTime(int turns, int damage) 
	{
		DmgOT = damage;
		turnsDMG = turns;
		
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public int getAttackStat()
	{
		return attackStat;
	}
	
	public void changeAttackStat(int change)
	{
		attackStat += change;
	}
	
	public int getHealthStat() {
		return healthStat;
	}
	
	public void setHealth(int h) {
		health = h;
	}
	
}
