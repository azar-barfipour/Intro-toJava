import java.util.Scanner;

public class echo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num, square;
		
		System.out.println("Enter a number");
		
		num = scan.nextInt();
		square = num * num;
		
		System.out.println("the result: " + square);
		

	}

}
