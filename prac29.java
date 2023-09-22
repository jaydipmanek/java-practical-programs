import java.util.*;
public class prac29 
{
    public static void main(String[] args) 
    {
        HashSet<String> h_set = new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Colors in HashSet Are:");
        for(String color:h_set)
        {
              System.out.println(color);
        }
    }
}