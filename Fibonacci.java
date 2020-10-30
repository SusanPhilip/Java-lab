import java.util.Scanner;

public class Fibonacci {
 static int n1=0,n2=1,n3=0;
 static void printfibonacci(int count)
 {
	 if(count>0)
	 {
		 n3=n1+n2;
		 n1=n2;
		 n2=n3;
		 System.out.println(n3);
		 printfibonacci(count-1);
	 }
 }
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values to be printed:");
		int count=sc.nextInt();
		System.out.println(n1);  
		System.out.println(n2); 
		printfibonacci(count-2);        //n-2 as two numbers are printed
		
	}

}
/*
 Output:
 Enter the number of values to be printed: 5
 0
 1
 1
 2
 3
*/
