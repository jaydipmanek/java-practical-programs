class Animal
{
	void eat()
	{
		System.out.println("This animal is eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("-------------------");
		System.out.println("This a Dog");
		System.out.println("Dog is barking");
	}
}
class Lion extends Animal
{
	void roar()
	{
		System.out.println("-----------------");
		System.out.println("This is a lion");
		System.out.println("lion is roaring");
	}
}
class prac16
{
	public static void main(String[]args)
	{
		System.out.println("This is hierarchical inheritance");
		Dog ob1=new Dog();
		Lion ob2=new Lion();
		ob1.bark();
		ob2.eat();
		ob2.roar();
		ob2.eat();

		

	}
}