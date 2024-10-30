package studio7;

public class Die 
{
	private int sides;
	
	public Die(int sidesinit)
	{
		sides = sidesinit;
	}
	
	public int getSides()
	{
		return sides; 
	}

	public void setSides(int sides) {
		this.sides = sides;
	}
	
	public int roll()
	{
	  int number = (int) (Math.random()* sides+1);
	  return number; 
	}
	
	 public static void main(String[] args) 
	    {
	       Die d1 = new Die(6);
	       System.out.println(d1.roll());
	       
	    }

}
