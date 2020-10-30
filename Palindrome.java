import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int originalnum,reverse=0,remainder;
		originalnum=num;
		while(num!=0)
		{
			remainder=num%10;
			reverse=reverse*10+remainder;
			num/=10;
		}
		if(originalnum==reverse)
			System.out.println(originalnum+" is a palindrome number");
		else
			System.out.println(originalnum+" is not a palindrome number");
		
	}
}
/*
Output:
Enter a number
121
121 is a palindrome number
*/