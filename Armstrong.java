import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int originalnum,remainder,result=0;
		originalnum=num;
		while(num!=0)
		{
			remainder=num%10;
			result+=Math.pow(remainder, 3);
			num/=10;
		}
		if(result==originalnum)
			System.out.println(originalnum+" is an Armstrong number ");
		else
			System.out.println(originalnum+" is not an Armstrong number ");

	}

}
/*
Output:
Enter a number
153
153 is an Armstrong number 
*/