package Formating;

public class conversion_type {

	public static void main(String[] args) {
		//for integers
		System.out.printf("%d%n",10);
		//for double
		System.out.printf("%f%n",10.1);//6 decimal in default
		System.out.printf("%f%n",10.12);
		System.out.printf("%f%n",10.12345678);//rounded the number
		//for character
		System.out.printf("%c%n",'a');
		System.out.printf("%C%n",'a');
		//for string
		System.out.printf("%s%n","hello");
		System.out.printf("%S%n","hello");
		//for boolean
		System.out.printf("%b%n", 5 < 4);
		System.out.printf("%B%n", 5 < 4);
		System.out.printf("%b%n", null);//true by default
		System.out.printf("%b%n", "cat");//true by default
		
		//scientific notation
		System.out.printf("%e%n", 10.123);
		System.out.printf("%E%n", 10.123);
		
		//decimal or scientific format
		System.out.printf("%g%n", 10000.0);
		System.out.printf("%g%n", 1000000.0);
		
		//octal
		System.out.printf("%o%n", 10);
		//hexadecimal
		System.out.printf("%x%n", 10);
		System.out.printf("%X%n", 10);
		//hash code
		System.out.printf("%h%n", "hello");
		//hexadecimal floating point
		System.out.printf("%a%n", 10.12);
		
		System.out.printf("%n");  
		System.out.printf("\n"); 
		System.out.printf("%n"); 
		System.out.printf("%%"); 
}

}
