package studio7;

public class Fraction 
{
	private double numerator;
	private double denominator; 
	
	public double getNumerator()
	{
		return numerator; 
	}
	
	public double getDenominator()
	{
		return denominator; 
	}

	public double addition (Fraction f)
	{
		double f1Numerator = this.numerator;
		double f1Denominator = this.denominator;
		double f2Numerator = f.getNumerator();
		double f2Denominator = f.getDenominator();
		double sum = (f1Numerator/f1Denominator) + (f2Numerator/f2Denominator);
		return sum;
	}
	public double multiplication (Fraction f)
	{
		double f1Numerator = this.numerator;
		double f1Denominator = this.denominator;
		double f2Numerator = f.getNumerator();
		double f2Denominator = f.getDenominator();
		double product = (f1Numerator/f1Denominator) * (f2Numerator/f2Denominator);
		return product;
	}
	
	public double reciprocal()
	{
		double f1Numerator = this.numerator;
		double f1Denominator = this.denominator;
		double reciprocal = f1Denominator/f1Numerator;
		return reciprocal;
	}
	
	public double simplify()
	{

		double f1Numerator = this.numerator;
		double f1Denominator = this.denominator;
		
		int gcf = 0;
		for (double i = 1; i<f1Numerator;i++)
		{
			for (double j =1; j<f1Denominator; j++)
			{
				
				
			}
		}
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
