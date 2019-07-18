package summer2019;

public class MathOperations {
	public static void main(String[] args) {
		double num = (double)24 * 8.0;
		System.out.println("24 * 8 = " + num);
		int num2 = (int)num + 4;
			//(int) to cast num as an integer instead of double
		System.out.println(num2);
		double num3 = 24 * 8;
		System.out.println("24 * 8 = " + num3);
		int num4 = 5/3;
		System.out.println("5/3 = " + num4);
		double num5 = 5/3;
		System.out.println("5/3 = " + num5);
			//int/int = int (chops off decimals then casts as double)
		double num6 = 5.0/3.0;
		System.out.println("5/3 = " + num6);
		double num7 = 5/3.0;
		System.out.println("5/3 = " + num7);
		int num1000 = 32 % 5;
		System.out.print("32 MODULOOOO 5 is " + num1000);
		System.out.println(" iHI BOB!");
		num += num3;
		//above is the same as num = num + num3;
	}
}
