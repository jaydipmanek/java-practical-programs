class anime
{
  String name;
  int epi;
  final String type="anime";

  anime(String name,int epi)
  {
  	this.name=name;
  	this.epi=epi;
  }

  void show()
  {
  	System.out.println("name:"+name);
  	System.out.println("number of episode:"+epi);
  	System.out.println("type:"+type);
  }


}
class prac10
{
	public static void main(String args[])
	{
    System.out.println("216090307102");
        System.out.println("rudra vaja");
		anime a1=new anime("one piece",1048);
		anime a2=new anime("naruto",720);

		a1.show();
		a2.show();

	}
}