class student
{
	String name;
	int eno;
	static String clg= "C.U.Shah Polytechnic";

	student(String name, int eno)
	{
		this.name=name;
		this.eno=eno;
	}

	void display()
	{
		System.out.println("name:"+name);
		System.out.println("enrollment no:"+eno);
		System.out.println("college:"+clg);
	}
}
	class prac9
	{
		public static void main(String args[])
		{
System.out.println("216090307102");
        System.out.println("rudra vaja ");
          student s1=new student("bhargav",7111);
          student s2=new student("jaydip",7106);

          s1.display();
          s2.display();

		}
	}
