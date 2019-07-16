package summer2019;

import java.util.Scanner;

public class LifeSpan {
	public static void main(String[] args) {
//This CoDe is used to find out how many years an individual Homo sapiens has to live, assuming that the individual lives to be 90 years old.
		Scanner input = new Scanner(System.in);
		int age;
		System.out.println("What is your age? (INTEGER PLS)");
		age = input.nextInt();
		int yrsleft = 90 - age;
		System.out.println("You have " + yrsleft + " years left to LIVE :)");
	}

}
