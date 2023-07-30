//Check Two Strings Anagram or Not
package day1;

import java.util.Arrays;
class Program10S
{
	
		public static void main(String[] args) {
			
		String str1 = "LISTEN";

		String str2 = "SILENT";

		char[] chararr1 = str1.toCharArray();

		char[] chararr2 = str2.toCharArray();

		if (chararr1.length != chararr2.length) {
			System.out.println("Not Anagram");
		}

		Arrays.sort(chararr1);

		Arrays.sort(chararr2);

		for (int i = 0; i <= chararr1.length - 1; i++)
		{
			if (chararr1[i] == chararr2[i]) 
			{
				System.out.println("Anagram");

			}
		}

	}
}
