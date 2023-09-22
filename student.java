class Student1{  
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
class prac6{  
 public static void main(String args[])
 { 
 System.out.println("216090307112");
 System.out.println("manek jaydip");
  

  Student1 s1=new Student1();  
  Student1 s2=new Student1();  
  s1.take(111,"jaydip "); 
  s2.take(112,"manek");  
  s1.show();  
  s2.show();  
 }  
}