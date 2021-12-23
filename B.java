package infinity_2K21_DIVISION_3_;
import java.io.*;
import java.util.*;
import java.lang.*;
public class B {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int arr[]=new int [n];
			int shot=0;
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
				if(arr[i]>k)
				{
					shot++;
				}
			}
			System.out.println(shot);
		}

	}

}
   