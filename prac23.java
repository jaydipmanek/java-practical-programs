class MyException extends Exception
{
    private int ex;
    MyException(int b)
    {
        ex=b;
    }
    public String toString()
    {
        return "My Exception :  Number is not divided by "+ex;
    }
}
class prac23
{
    static void divide(int a,int b) throws MyException
    {
        if(b<=0)
        {
            throw new MyException(b);
        }
        else
        {
            System.out.println("Division : "+a/b);
        }
    }
    
    public static void main(String arg[])
    {
        try
        {
            divide(10,5);
        }
        catch(MyException me)
        {
            System.out.println(me);     
        }
    }

}
