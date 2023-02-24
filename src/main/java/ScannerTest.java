import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		//int a = scanner.nextInt();
		
		//System.out.println("Value="+a);
		
		String c = scanner.next();
		System.out.println("The initial of your name is: "+ c.toUpperCase().charAt(0));
		
		scanner.close();
	}
}
