/*Write a method that takes a String and returns a String of the same length containing the 
  'X' character in all positions except the last 4 positions. The characters in the last 4 
  positions must be the same as in the original string. For example, if the argument is

  "12345678", the return value should be "XXXX5678".
*/
import java.util.Scanner;

public class CharacterXXX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:- " );
		String input1 = sc.nextLine();
		String input2= myString(input1);
		System.out.println("Current Number:- " +input2);
		sc.close();

	}

	private static String myString(String input) {
		char[] ch= input.toCharArray();
		for(int i=0; i<input.length()-4; i++)
		{
			ch[i] = 'X';
		}
		input = String.valueOf(ch);
		return input;
	}

}
