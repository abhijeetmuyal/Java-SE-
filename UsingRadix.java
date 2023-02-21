import java.lang.*;
import java.util.*;

class UsingRadix
{
	public static void main(String args[])
	{
		int x;	
		Scanner sc=new Scanner(System.in);
		sc.useRadix(2);
		x=sc.nextInt();
		System.out.print(x);
		
	}
}