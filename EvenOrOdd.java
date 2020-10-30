import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		if(a%2==0)
			System.out.println(a+" is even");
		else
			System.out.println(a+" is odd");
	}

}

/*
  Output:
  Enter a number
  45
  45 is odd
  Enter a number
  32
  32 is even
*/
