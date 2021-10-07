import java.util.Scanner;

public class AddTwo {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int first,second,sum;
		
		System.out.println("Enter first num");
		first = scan.nextInt();
		
		System.out.println("Enter second num");
		second = scan.nextInt();
		
		sum = first + second;
		
		System.out.println("sum:" + sum);
	}
}
