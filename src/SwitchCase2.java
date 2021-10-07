
public class SwitchCase2 {

	public static void main(String[] args) {
		
		String name = "john";
		
		switch(name.toLowerCase()) {
		case "eric":
			System.out.println("Eric");
			break;
		case "derrick":
			System.out.println("Derrick");
			break;
		case "john":
			System.out.println("John");
			break;
		default:
			System.out.println("Invalid");
			break;
		}

	}

}
