//Remove White spaces from sentence

package day1;
class Program3S
{
	
		public static void main(String[] args) {
		
			
		String str="Madam  2355 @#45 aei";
		
		String newstr=str.replaceAll("\\s","");
		System.out.println(newstr);

	}
}
