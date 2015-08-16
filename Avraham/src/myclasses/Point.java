// Avraham Moryosef
// CS 420
// 6/25/15

package myclasses;

public class Point implements Cloneable
{
	private int x, y;
	
	public Point()
	{
		x = 0;
		y = 0;
	}
	
	public Point(int X, int Y)
	{
		this.x = X;
		this.y = Y;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	private void setX(int x)
	{
		this.x = x;
	}

	private void setY(int y)
	{
		this.y = y;
	}
	
	public void setPoint(int newX, int newY)
	{
		getX();
		getY();
		
		setX(x);
		setY(y);
	}
	
	public void up(int i)
	{
		y = getY() + i;
	}
	
	public void down(int i)
	{
		y = getY() - i;
	}
	
	public void left(int i)
	{
		x = getX() - i;
	}
	
	public void right(int i)
	{
		x = getX() + i;
	}
	
	public String toString()
	{
		return "(" + getX() + "," + getY() + ")";
	}
	
	public boolean equals(Object obj) 
	{
	    if (this == obj)
	        return true;
	    
	    if (obj == null)
	        return false;
	    
	    if (getClass() != obj.getClass())
	        return false;
	    
	    Point that = (Point) obj;
	    
	    if (y != that.y)
	        return false;
	    
	    if (x != that.x)
	        return false;
	    
	    return true;
	}
	
	public Point clone() throws CloneNotSupportedException
	{
		try
		{
			return (Point) super.clone();
		}		
		catch(CloneNotSupportedException cnse)
		{
			System.out.println(cnse);
			return null;
		}
	}	
}
