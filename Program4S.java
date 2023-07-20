//find even length word in sentence

package day1;
class Program4S
{
	
		public static void main(String[] args) {
		
			
		String str="Madam  ok notok";
		
		
		String[] strarr=str.split(" ");
		
		for(String word:strarr)
		{
			if(word.length()%2==0)
			{
				System.out.println(word);
			}
		}
		

	}
}
