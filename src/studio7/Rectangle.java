package studio7;

import module07._1parts.Person;

public class Rectangle 
{
	   // instance variables 
    private double length;
    private double width;
    private boolean isSquare;
    private boolean isSmaller; 
    
    // constructor: construct a Person copying in the data into the instance variables
    public Rectangle(double initlength, double initwidth) {
       length = initlength;
       width = initwidth;
       isSquare = false;
       isSmaller= false;
    }
    
    // String representation of a person
    /*public String toString() {
      String result = "Name: " + name + ", ";
      result += "Email: " + email + ", ";
      result += "Phone Number: " + phoneNumber;
      return result;
    }*/
    
    
    public double area(double length, double width)
    {
    	double area = length*width;
    	return area; 
    }
    
    public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double perimeter(double length, double width)
    {
    	double perimeter = 2*length+2*width;
    	return perimeter; 
    }
    public boolean checkSize(Rectangle r)
    {
    	double r1area = area(this.length, this.width);
    	double r2area = area(r.getLength(),r.getWidth());
    	if (r1area < r2area)
    	{
    		isSmaller = true; 
    	}
    	return isSmaller;
    }
    public boolean checkSquare(Rectangle r)
    {
    	double length = r.getLength();
        double width = r.getWidth();
        if (length == width)
        {
        	isSquare = true; 
        }
        return isSquare;
    }
    
    public static void main(String[] args) 
    {
       Rectangle r1 = new Rectangle(5, 9);
       Rectangle r2 = new Rectangle(10, 10);
       System .out.println (r2.checkSize(r1));
       System .out.println(r1.checkSquare(r1));
       
    }
}
