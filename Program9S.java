//Swapping Two String without using 3rd string
package day1;
class Program9S
{
	
		public static void main(String[] args) {
			
		
		String str1 = "mayur";
		
		String str2="mehar";
		
		
		str1=str1.concat(str2);
		
		str2=str1.substring(5);
		
		str1=str1.substring(0,5);
		
		
		System.out.println(str2);
		System.out.println(str1);

	}
}
