//count no of Vowels , consonent ,spaces and Special character

package day1;
class ProgramS
{
	
		public static void main(String[] args) {
		
			
		String str="Madam  2355 @#45 aei";
		
		int vowelscount=0;
		int digitcount=0;
		int specharcount=0;
		int spacecount=0;
		int cosonentcount=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
		char ch=str.charAt(i);
		
		if(Character.isLetter(ch))
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' )
			{
				vowelscount++;
			}
			
			else
		   {
			cosonentcount++;
		   }
		}
		else if(Character.isWhitespace(ch))
		{
			spacecount++;
		}
		else if(Character.isDigit(ch))
		{
			digitcount++;
		}
		else
		{
			specharcount++;
		}
	
		}
		
		System.out.println(vowelscount);
		System.out.println(digitcount);
		System.out.println(spacecount);
		System.out.println(cosonentcount);
		System.out.println(specharcount);
		
	

		
		
		
		
		
	

	}
}
