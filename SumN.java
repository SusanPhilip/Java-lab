import java.util.Scanner;

public class SumN {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
			sum+=i;
		System.out.println("Sum="+sum);

	}

}
/*
 Output:
 Enter the value of n
10
Sum=55
*/
