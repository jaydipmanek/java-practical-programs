 class student{
	int id;
	String name;

	student(){

		System.out.println("this is a default constructor");

	}
	student(int i,String n){
		id=i;
		name=n;


	}
}
 class prac12{
	public static void main(String[]args)
	{
		student s=new student();
		System.out.println("\n default constructor Value:\n");
		System.out.println("student id:"+s.id+"\nstudnet name:"+s.name);
		System.out.println("\nprameterized constructor values:\n");
		student s2=new student(10,"jaydip");
		System.out.println("student id:"+s2.id+"\nstudnet name:"+s2.name);

	}
}