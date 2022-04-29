package pri;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the number");
		Scanner number=new Scanner(System.in);
		int num= number.nextInt();
		System.out.println(num);
		
		switch(num)
		{
			case 1: 
				System.out.println("today is sunday");
		break;
		
			case 2: 
				System.out.println("today is monday");
		break;
		
		
			case 3: 
				System.out.println("today is tuesday");
		break;
			case 4: 
				System.out.println("today is wednesday");
		break;
		
			case 5: 
				System.out.println("today is Thursday");
		break;
			case 6: 
				System.out.println("today is Friday");
		break;
		
			case 7: 
				System.out.println("today is saturday");
		break;
		
		
		default:
			System.out.println("enter the number between 1-7");
		
		}	
		
	}}
	


