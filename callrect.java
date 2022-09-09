/*Program to demonstrate the use of class 
 Call this file RectangleDemo1.java*/

 import java.util.*;

class Rectangle
{
	int length;
	int width;
}

class RectangleDemo1
{
	public static void main(String args[])
	{
		Rectangle rect=new Rectangle();
		int area;
		//assign values to rect1's instance variables
		Scanner sc=new Scanner(System.in);
		rect.length=sc.nextInt();
		rect.width=sc.nextInt();

	//compute area of first rectangle
	area=rect.length*rect.width;

	System.out.println("Area of Rectangle is:"+area);

	}
}
