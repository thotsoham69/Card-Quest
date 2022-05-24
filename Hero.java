import java.util.ArrayList;

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
	private int shield;
	
	public Hero(String name,int AttackStat, int healthStat, int gold)
	{
		this.healthStat = healthStat; 
		this.name = name;
		OriginalA = AttackStat;
		this.attackStat = OriginalA;
		health = healthStat;
		this.gold = gold;
		this.energy = 5;
		shield = 0;
		deck = new Deck();
		deck.getDeck().add(new AttackCard());
		deck.getDeck().add(new AttackCard());
		deck.getDeck().add(new AttackCard());
		 
	}
	
	

	public int takeDamage(int damage)
	{
		if(shield >= damage)
		{
			shield -= damage;
			damage = 0;
		}
		
		else if(shield < damage)
		{
			damage -= shield;
			shield = 0;
		}
		
		health = health - damage;
		
		if(health <= 0)
		{
			die();
		}
		return health;
	}
	
	public void atStart()
	{
		shield = 0;
		energy += 5;
		if(DmgOT > 0 && turnsDMG > 0)
		{
			takeDamage(DmgOT);
			turnsDMG--;
			if(turnsDMG == 0)
			{
				DmgOT = 0;
			}
		}
		
	}
	
    public void dealDamage(int damage, Enemies enemy)
    {
    	
    	enemy.takeDamage(damage);
    	
    	
    }

    public void gainReward(int reward)
    {
    	
    	gold += reward;
    	
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
	
	public void shield(int amt)
	{
		shield += amt;
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
	
	public Deck getDeck()
	{
		return deck;
	}
	
	public int getHealthStat()
	{
		return healthStat;
	}

	public int getEnergy()
	{
		return energy;
	}
	
	public int getGold()
	{
		return gold;
	}
	
	public void gainGold(int reward)
	{
		gold += reward;
	}
	
	public int getOAttack()
	{
		return OriginalA;
	}
	
	public void setOAttack(int amt)
	{
		OriginalA += amt;
		attackStat = OriginalA;
	}
	
	public void setOHealth(int amt)
	{
		healthStat += amt;
		health = healthStat;
	}
	
	public void setEnergy(int nrg)
	{
		energy += nrg;
	}
	
	public String getName()
	{
		return name;
	}
	
	public ArrayList<Card> getDeckList()
	{
		
		return deck.getDeck();
	}
	
	public ArrayList<Card> getFullDeckList()
	{
		ArrayList<Card> returner = new ArrayList<Card>();
		returner.addAll(deck.getDeck());
		returner.addAll(deck.getDiscard());
		returner.addAll(deck.getHand());
		return returner;
	}



	public int getShield() 
	{
		
		return shield;
	}

}
