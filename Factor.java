import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("The factors of "+num+" are:");
		for(int i=1;i<=num;i++)
			if(num%i==0)
				System.out.println(i);

		
	}

}
/*
Output:
Enter a number
45
The factors of 45 are:
1
3
5
9
15
45

 */
