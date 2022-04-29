package pri;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the first number");
		Float a =scan.nextFloat();
		System.out.println("Enter the second number");
		Float b =scan.nextFloat();
		System.out.println("Enter the third number");
		Float c =scan.nextFloat();
		System.out.println("Enter the forth number");
		Float d =scan.nextFloat();
		System.out.println("Enter the fifth number");
		Float e =scan.nextFloat();
		System.out.print("percentage is:");
		Float percentage= (a+b+c+d+e)/5;
		System.out.println(percentage+"%");

		

		
	}

}
