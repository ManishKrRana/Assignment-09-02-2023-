/*Write a method that takes a String[] as an argument and returns a String containing the 
  concatenation of all the strings in the input array. Invoke your method 3 times with 
  different arguments. Make sure that your code handles the cases where the argument is null.
 */
public class Concatenation {

	public static void main(String[] args) {
		String[] str = {"Manish", "Kumar", "Rana"};
		String result = concat(str);
		System.out.println(result);
	}

	private static String concat(String[] str) {
		String result = "";
		if(str!=null)
		{
			for(int i=0; i<str.length;i++)
			{
				result +=str[i];
			}
		}
		return result;
	}

}
