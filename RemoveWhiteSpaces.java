//Write a Java program to remove all white spaces from a string?
import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:- " );
		String input = sc.nextLine();
		
		input = input.replaceAll("\\s","");
		System.out.println("Final String :- " +input);
        sc.close();
	}

}
