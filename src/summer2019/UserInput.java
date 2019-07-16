package summer2019;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = input.nextInt();
		System.out.println("You are " + age + " years old.");
	}

}
