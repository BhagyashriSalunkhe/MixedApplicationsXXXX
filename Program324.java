//Write a java program which accept N numbers from user and display all such elements which are divisible by 3 and 5
//ip=N:6   Elements : 85    66  3   15  93  88
//op=15      

import java.util.*;

class ArrayX
{
    public int Arr[];

    public ArrayX(int iLength)
    {
        Arr=new int[iLength];
    }
    
    protected void Accept()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the "+Arr.length+" elements of array");
        for(int i=0;i<Arr.length;i++)
        {
           Arr[i]=sobj.nextInt();
        }
        System.out.println();
    }
    protected void Display()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println(Arr.length+" elements of array of array are :");
        for(int i=0;i<Arr.length;i++)
        {
           System.out.print(Arr[i]+"\t");
        }
        System.out.println(); 
    }
}
class MainLogic extends ArrayX
{
  public MainLogic(int iSize)
  {
    super(iSize);
  }
  public void DivisibleByFiveAndThree()
  {
    System.out.println("Elements divisible by 5  and 3 are:");
    for(int i=0;i<Arr.length;i++)
    {
        if((Arr[i]%5==0)&&(Arr[i]%3==0))
        {
          System.out.print(Arr[i]+"\t");
        }
       
    }
    
  }
}
class Program324
{
    public static void main(String as[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter size of array");
        int iSize=sobj.nextInt();
        MainLogic mlobj=new MainLogic(iSize);
        mlobj.Accept();
        mlobj.Display();
        mlobj.DivisibleByFiveAndThree();
    }
}