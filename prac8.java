class car 
{
	String model;
	String color;
	int price;
	
	car()
	{
		this("default","default",0);
	} 
	car(String model,String color,int price)
	{
		this.model=model;
		this.color=color;
		this.price=price;

	}
	void show()
	{
		System.out.println("car:"+model);
		System.out.println("color:"+color);
		System.out.println("price:"+price);
	}

}
class prac8{
	public static void main(String args[])
	{   
 System.out.println("216090307102");
        System.out.println("rudra vaja");
		car c1=new car();
		car c2=new car("GTR","BLACK",8000000);
		c2.show();
		System.out.println("this is default value");
		c1.show();

	}
}

