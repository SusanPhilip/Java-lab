import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
			f*=i;
		System.out.println("Factorial= "+f);
	}	
		
}
/* 
 Output:
 Enter a number
 5
 Factorial= 120

 */
