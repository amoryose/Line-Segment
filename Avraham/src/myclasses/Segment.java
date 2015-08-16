// Avraham Moryosef
// CS 420
// 7/5/15

package myclasses;

import myclasses.Point;

public class Segment extends Point implements Cloneable
{
	private Point p1, p2;
	
	public Segment()
	{
		this.p1 = new Point();
		this.p2 = new Point();
	}
	
	public String getP2()
	{
		return p2.toString();
	}

	public String toSting()
	{
		return "(" + p1.getX() +","+ p1.getY() + ")" +
			   "-" + "(" + p2.getX() +","+ p2.getY() + ")";
	}	
	
	public boolean equals(Object obj) 
	{
	    if (this == obj)
	        return true;
	    
	    if (obj == null)
	        return false;
	    
	    if (getClass() != obj.getClass())
	        return false;
	    
	    Segment that = (Segment) obj;
	    
	    if (p1 != that.p1)
	        return false;
	    
	    if (p2 != that.p2)
	        return false;
	    
	    return true;
	}
	
	public Segment clone()
	{
		try
		{			
			Segment cloned = (Segment) super.clone();
			cloned.p1 = (Point) p1.clone();
			cloned.p2 = (Point) p2.clone();
			return (cloned);
		}
		
		catch (CloneNotSupportedException cnse)
		{
			System.err.println(cnse);
			return null;
		}
	}
	
	public double length(Point p1, Point p2)
	{
		double xPow = Math.pow((p1.getX() - p2.getX()), 2);
		double yPow = Math.pow((p1.getY() - p2.getY()), 2);
		
		double length = Math.sqrt(xPow + yPow);
		
		return length;
	}
}
