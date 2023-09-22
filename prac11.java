import java.util.*;
class shape
{
	float radius;
	float lenght;
	float width;


	void area(float radius)
	{
		double r;
		System.out.println("the area of circle is:");
		r=3.14*radius*radius;
		System.out.println(r);
	}

	void area(float length,float width)

	{
		double ar;
		System.out.println("The area of rectangle is:");
		ar=length*width;
		System.out.println(ar);
	}
}
class prac11
{
	public static void main(String args[])
	{
		System.out.println("rudra vaja");
		System.out.println("216090307102");
		Scanner take=new Scanner(System.in);
		shape s1=new shape();
		System.out.println("enter lenght,width and radius");
		float a=take.nextFloat();
		float b=take.nextFloat();
        float c=take.nextFloat();
        s1.area(c);
        System.out.println("");
        s1.area(a,b);

	}
}