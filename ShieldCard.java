
import java.awt.Color;

public class ShieldCard extends Card
{

	public ShieldCard() 
	{
		
		super(Color.BLUE, "This Card activates a shield equal to " +  "\n " + "25% of the Hero's healthstat", 1, "Shield");
		
	}
	
	public void use(Hero hero, Enemies enemy) 
	{
		int amt = (int)(hero.getHealthStat()*0.25);
		hero.shield(amt);
		
		
	}
	
	
	
	
	
}
