// Avraham Moryosef
// CS 420
// 7/5/15

package testmyclasses;

import myclasses.Point;
import myclasses.Segment;

public class TestSegment
{
	public static void main(String[] args)
	{
		Segment linep1 = new Segment();
		Segment linep2 = new Segment();
		Point q1 = (Point) linep1;
		Point q2 = (Point) linep2;
		
		q1.right(2);
		q1.up(3);
		q2.right(2);
		System.out.println("Segment ab: " + linep1.toString() +
						   "-" + linep2.toString());
		
		String str = "length of ab is " + ((Segment) q1).length(linep1, linep2);
		
		q2.left(5);
		q2.down(2);
		System.out.println("Segment ad: " + linep1.toString() +
				   		   "-" + linep2.toString());
		
		str = str + "\nLength of ad is " + ((Segment) q1).length(linep1, linep2);
		
		q2.right(1);
		q2.up(2);
		System.out.println("Segment ae: " + linep1.toString() +
				           "-" + linep2.toString());
		
		str = str + "\nLength of ae is " + ((Segment) q1).length(linep1, linep2);
		
		q1.down(3);
		System.out.println("Segment be: " + linep1.toString() +
						   "-" + linep2.toString());
		
		str = str + "\nLength of be is " + ((Segment) q1).length(linep1, linep2);
		
		System.out.println(str);
	}
}
