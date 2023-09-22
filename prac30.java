import java.util.*;
public class prac30 
{
    public static void main(String[] args) 
    {
    	HashMap<Integer,String> student=new HashMap<Integer,String>();

    	student.put(7111,"bhargav");
    	student.put(7112,"jaydip");
    	student.put(7106,"viren");
    	student.put(7102,"rudra");
    	student.put(7127,"ronak");
    	System.out.println("Details of students");
    	System.out.println("-----------------------");
    	System.out.println("En No"+"		"+"Name");
    	System.out.println("-----------------------");
    	for(Map.Entry m:student.entrySet())
    	{
    		System.out.println(m.getKey()+"		"+m.getValue());
    	}
    }
}