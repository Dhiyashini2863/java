import java.io.*;
class Prime 
{
  public static void main(String[] args)throws Exception
  {
    int n;
    int f = 0;
    DataInputStream d = new DataInputStream(System.in);
    System.out.print("Enter a number:");
    n=Integer.parseInt(d.readLine());
    for (int i = 2; i <= n / 2; ++i) 
    {
      if (n % i == 0) 
      {
        f = 1;
        break;
      }
    }
    if(n==1)
      System.out.print("1 is neither prime nor composite");

    if (f!=1)
      System.out.println(n + " is  prime ");
    else
      System.out.println(n + " is not  prime ");
  }
}
