
public class MakeDecision {

	public static void main(String[] args) {
		int x = 4;
		
		if(x != 5) {
			System.out.println("x is not 5");
		}else {
			System.out.println("x is 5");
		}
		
		int y = 6, z = 7;
		
		if(4<5) {
			System.out.println("true");
		}else {//
			System.out.println("false");
		}// not getting here never
		
		if (x >= y) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		if(bool1 && bool2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		boolean m = false;
		boolean n = false;
		
		if(m || n) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		//if..else
		int b = 5;
		if(b == 5) {
			System.out.println("b is 5");
		}else if (b > 5){
			System.out.println("b is greater than 5");
		}else {
			System.out.println("b is smaller than 5");
		}
		//Ternary operator
		boolean a = true;
		a = (10 == 5) ? true : false;
		System.out.println(a);

	}

}
