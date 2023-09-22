import java.util.*;
class prac28
{
	public static void main(String args[])
	{
		ArrayList<String> weakdays=new ArrayList<String>();
		weakdays.add("Monday");
		weakdays.add("Tuesday");
		weakdays.add("Wednesday");
		weakdays.add("Thursday");
		weakdays.add("Friday");
		weakdays.add("Saturday");
		weakdays.add("Sunday");
		System.out.println("WeakDays are:");
		ListIterator<String> itr=weakdays.listIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"  ");
		}
		LinkedList<String> month=new LinkedList<String>();
		month.add("January");
		month.add("February");
		month.add("March");
		month.add("April");
		month.add("May");
		month.add("June");
		month.add("July");
		month.add("August");
		month.add("September");
		month.add("October");
		month.add("November");
		month.add("December");
		System.out.println();
		System.out.println("Months are:");
		ListIterator<String> itr1=month.listIterator();
		while(itr1.hasNext())
		{
			System.out.print(itr1.next()+"  ");
		}
	}	
}
