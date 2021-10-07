import java.util.Scanner;

public class individe {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int divided,divisor,quotient,reminder;
		
		System.out.println("enter divided");
		divided = scan.nextInt();
		
		System.out.println("enter divisor");
		divisor = scan.nextInt();
		
		quotient = divided / divisor;
		reminder = divided % divisor;
		
		
		System.out.println("result:" + quotient);
		System.out.println("result:" + reminder);
	}
}
