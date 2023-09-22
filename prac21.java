class Finaldemo
{
	public final void display()
	{
		System.out.println("This is a final method");
	}
}
class main extends Finaldemo
{
	public final void display()
	{
		System.out.println("this final method is Overriding");
	}
    
	public static void main(String[]args)
	{
		main obj=new main();
		obj.display();
	}
}
