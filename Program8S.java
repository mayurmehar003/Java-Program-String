//Reverse Each Word in Given String
package day1;
class Program8S
{
	
		public static void main(String[] args) {
			
		
		String str = "Hello World";

		String[] strarr = str.split(" ");

		String revstring = "";

		for (String w : strarr) {

			String rev1 = "";

			for (int i = w.length() - 1; i >= 0; i--) {
				rev1 = rev1 + w.charAt(i);
			}

			revstring = revstring + rev1 + " ";

		}
		
		System.out.println(revstring);
		

	}
}
