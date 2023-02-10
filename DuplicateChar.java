//Make a method that accepts a String from user and print all Duplicate character which belongs to that String.
import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:- " );
		
		String input = sc.nextLine();
		int count = 0;
		char[] ch = input.toCharArray();
		
		for(int i=0; i<input.length(); i++)
		{
			for(int j=i+1; j<input.length(); j++)
			{
				if(ch[i] == ch[j]) {
					System.out.println("Duplicate Characters are:- " +ch[j]);
					count++;
					break;
				}
			}
		}
		
	}

}
