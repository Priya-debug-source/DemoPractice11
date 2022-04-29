package pri;

import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the first number");
		int a =scan.nextInt();
		System.out.println("Enter the second number");
		int b =scan.nextInt();
		System.out.println("Enter the third number");
		int c =scan.nextInt();
		System.out.print("percentage is:");
		float percentage= (a+b+c)/3;

		System.out.println(percentage+"%");
		
		if(percentage>33) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}

}
