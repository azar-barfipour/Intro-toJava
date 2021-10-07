
public class RegularForLoop {

	public static void main(String[] args) {
		for(int i = 1000; i>= 1 ; i--) {
			System.out.println("value of i: " + i);
		}
		
		int num = 10;
		boolean isPrime = true;
		
		for(int i = 2; i < num/2 ; i++) {
			if(num % i == 0) {
				isPrime = false;
			}
		}
		if(isPrime == true) {
			System.out.println("is prime");
		}else {System.out.println("is not");}
	}

}
