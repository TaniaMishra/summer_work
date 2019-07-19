package summer2019;

import java.util.Scanner;

public class InputDataTypesTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //one scanner is GOOD ENOUGH; can reuse like tool in toolbox
		
		
		
		
		
		final int chairs = 30;
		double value = 1.12358;
		char favletter = 'r';
		System.out.println("there are " +chairs +" chairs in the room.");
		System.out.println(value);
		System.out.println("my favorite letter is " +favletter);
		
		
		
		
		System.out.println("What is the date?");
		int day = input.nextInt();
		
		System.out.println("What is the month?");
		int month = input.nextInt();
		
		System.out.println("what is the year?");
		int year = input.nextInt();
		
		System.out.println(month +"-" +day +"-" +year);
		
	}
}
