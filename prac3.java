public class prac3  
{  
public static void main(String[] args)   
{
System.out.println("216090307102");
        System.out.println("rudra vaja");  
int number = 987654, reverse = 0;  
while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
}  