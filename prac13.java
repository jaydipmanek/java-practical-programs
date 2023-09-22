import java.lang.*;

public class prac13

{
   public static void main (String[] ars)
   {
   	 String str="bhargav";
	 
	 char ans=str.charAt(2);
	 System.out.println("The Character at second position is :- "+ ans);
	 boolean ans2=str.contains("ay");
	 System.out.println("Dose the string contains the Character ay :-"+ ans2);
	 int ans3=str.length();
	 System.out.println("The length of string is :-"+ans3);
	 String[] ans4=str.split(" ");
	 System.out.println("After splitting :-");
	 for (String a:ans4)
	 {
     		System.out.println(a);
	 }
	 String ans5=str.format("My name is %s ",str);
	 System.out.println(ans5);
    }
 
}