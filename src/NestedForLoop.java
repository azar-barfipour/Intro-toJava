import java.util.Scanner;

public class NestedForLoop {

	public static void main(String[] args) {
//		for(int i = 1; i <=10; i++) {
//			for(int j = 1; j <= 10;j++) {
//			System.out.println(i +"    "+j);
//			}
//		}
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter a number");
		
		num = scan.nextInt();
		
		for(int i = 1; i <=num; i++) {
			for(int j = 1; j <= num-i;j++) {
			System.out.print("*");
				}

			System.out.println();
		}
	}
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		int num;
//		
//		System.out.println("Enter a number");
//		
//		num = scan.nextInt();
//		
//		for (int i = 0; i <= num; i++)
//		{ 
//			for (int j = 0; j <= num - i; j++) { 
//			System.out.print(" "); 
//			} 
//		for (int k = 0; k <= i; k++) 
//		{ 
//		System.out.print("*"+ " ");
//		}
//		System.out.println(); 
//		} 
//		}

	
	}


