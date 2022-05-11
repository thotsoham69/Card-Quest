import java.awt.Color;

public class Card {
	
	private Color color;
	private String effect;
	private int energy;
	private String name;
	
	public Card(Color color, String effect, int energy, String name)
	{
		this.color = color;
		this.effect = effect;
		this.energy = energy;
		this.name = name;
		
	}
	
	public void use()
	{
		
	}
	
	public String getEffect()
	{
		return effect;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public void setEnergy(int newEnergy)
	{
		energy = newEnergy;
	}
	
	public Color getColor()
	{
		return color;
	}

	
	
}
