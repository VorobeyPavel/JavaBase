import java.util.Scanner;

public class MySecondProgram{
	
	public static void main(String[] args){
		System.out.println("Vvedite imya");
		
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();

		System.out.println("Hello "+name);
		
	}
}
