class rectangle
{
  int height;
  int weight;
  

  rectangle(int height,int weight)
  {
  	this.height=height;
  	this.weight=weight;
  }

  void show()
  {
  	System.out.println("height:"+height);
  	System.out.println("weight:"+weight);
  	
  }


}
class prac7
{
	public static void main(String args[])
	{
    System.out.println("216090307102");
        System.out.println("rudra vaja");
		rectangle a1=new rectangle(10,20);
		

		a1.show();
		

	}
}