class thread_exmp extends Thread
{
	int count=1;
	static int max=20;
	thread_exmp(String str)
	{
		super(str);
	}
	synchronized public void odd_num()
	{
		while(count<=max)
		{
			if(count%2==1)
			{
				System.out.println(Thread.currentThread().getName()+":odd_Number:"+count);
			}
			count++;
		}
	}
	synchronized public void even_num()
	{
		while(count<=max)
		{
			if(count%2==0)
			{
				System.out.println(Thread.currentThread().getName()+":even_Number:"+count);
			}
			count++;
		}
	}
	public void run()
	{
		try
		{
			if (Thread.currentThread().getName()=="Thread")
			 {
				odd_num();
			}
			else{
				even_num();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
class prac26
{
	public static void main(String args[])
	{
		thread_exmp t1=new thread_exmp("Thread1");
		thread_exmp t2=new thread_exmp("Thread2");
		t1.start();
		t2.start();

	}
}
