package Formating;

public class CompositionOrPrintf {
	public static void main(String[] args) {
		double num1 = 10.1234;
		double num2 = 12.3456789;
		
		System.out.printf("%f%n",num1);//default 6 decimal places 
		
		System.out.printf("%.0f%n",num1);
		System.out.printf("%.1f%n",num1);
		System.out.printf("%.2f%n",num1);
		System.out.printf("%.3f%n",num1);
		System.out.printf("%.4f%n",num1);
		System.out.printf("%.5f%n",num1);
		System.out.printf("%.6f%n",num1);
		System.out.printf("%.7f%n",num1);
		System.out.printf("%.8f%n",num1);
		
		String str = "hello";
		int num3 = 15;
		char let = 'A';
		
		System.out.printf("%.2s%n",str);
		System.out.printf("%.3s%n",str);
		System.out.printf("%.3b%n",true);
		System.out.printf("%.2h%n",str);
		//System.out.printf("%.3d%n",num3);//cannot specify precision on int
		//System.out.printf("%.2c%n",let);//...
		//System.out.printf("%.3n");

		
	}
}
