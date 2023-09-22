class a{
	public int x=700;

}
  class b extends a
  {		
  	int y=400;
  	void display()
  	{
  		
  		System.out.println("value of x and y:"+x+" "+y);
  	}
  }	
   class prac14
   {
   	public static void main (String[]args)
   	{
   		b p=new b();
   		p.display();
   	}
   }