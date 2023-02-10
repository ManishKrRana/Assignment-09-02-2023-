/*Create two arrays. One containing String values: Peter , Amy, John ,Boyd, and Cathy, 
 and another one containing int values: 15,9, 14, 10,and 12.  create an table showing  
 these values as name value pairs as below.

               Name           Value

               Amy             9
               Boyd            10
               Cathy           12
               John            14
               Peter           15
 */
public class StringPairs {

	public static void main(String[] args) {
		String[] names = {"Amy", "Boyd", "Cathy", "John", "Peter"};
		int[] values = {9, 10, 12, 14, 15};
		System.out.println("Tables are given below:- ");
		
		System.out.println("\nName \t\t Value");
		for(int i =0; i< names.length; i++)
		{
			System.out.println(names[i] + "\t\t" +values[i]);
		}

	}

}
