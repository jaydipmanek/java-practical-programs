class Student1
{  
 int rollno;  
 String name;  
 void take(int r, String n)
 {  
  this.rollno=r;  
  this.name=n;  
  }
 void show()
 {
  System.out.println(this.rollno+" "+this.name);
}  
}  
class prac6
{  
  public static void main(String args[])
 { 
  System.out.println("216090307102");
        System.out.println("rudra vaja");
  

  Student1 s1=new Student1();  
  Student1 s2=new Student1();
  Student1 s3=new Student1();  
  s1.take(111,"rudra"); 
  s2.take(112,"mkkk"); 
  s3.take(113,"luffy") ;
  s1.show();  
  s2.show(); 
  s3.show(); 
 }  
}