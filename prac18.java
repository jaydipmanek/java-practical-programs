class car
{
	int tospeed;
	String name;

	car(int tospeed,String name)
	{
		this.tospeed=tospeed;
		this.name=name;
	}

	public String toString()
	{
		return tospeed+" "+name;
	}
}
 
class prac18
{
	public static void main(String args[])
	{
		car c=new car(300,"supra");
		car c1=new car(325,"ferrari");
		car c2=new car(220,"camero");
		car c3=new car(250,"mustang");
		car c4=new car(330,"gtr");

		System.out.println("tospeed and name of car:");
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
	}
}