import java.util.Scanner;
import java.io.*;
class armstrong
{
	public static void cube(int n)
	{
		int m;
		int s=0;
		while(n>0)
		{
			m=n%10;
			int c=m*m*m;
			n=n/10;
			s=s+c;
		}
		if(n==s)
		{
			System.out.println("armstrong");

		}
		else
		{
			System.out.println("Not");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		cube(n);
	}
}

