class Animal
{
	void eat()
	{
		System.out.println("This animal is eating");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("-------------------");
		System.out.println("This a Dog");
		System.out.println("Dog is barking");
	}
}

class prac17
{
	public static void main(String[]args)
	{
		System.out.println("This method is Overriding");
		Dog ob1=new Dog();
		Lion ob2=new Lion();
		ob1.eat();
		ob2.eat();

		

	}
}