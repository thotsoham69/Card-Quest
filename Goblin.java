import java.util.ArrayList;

public class Goblin extends Enemies
{
 
	private String nextMove;
	private ArrayList<String> rotation;
	Action action = new Action(this);
	public Goblin(String name, int healthStat, int attackStat, int reward) {
		super(name, healthStat, attackStat, reward);
		rotation = new ArrayList<String>();
		rotation.add("Attack");
		rotation.add("Attack");
		nextMove = rotation.get(0);
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
					
		}
	}
	
	public String getNextMove()
	{
		return nextMove;
	}

}
