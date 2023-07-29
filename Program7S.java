//Count the Number of Words start with Vowles
package day1;
class Program7S
{
	
		public static void main(String[] args) {
		
			
			String str = "hii I am Mayur I am Java Developer";
		
		String str1=str.toLowerCase();
		
		String[] strarr=str1.split(" ");
		
		int count=0;   //Number Keep On Adding
		for(int i=0;i<=strarr.length-1;i++)
		{
			
			if(strarr[i].charAt(0)=='a'|| strarr[i].charAt(0)=='e'|| strarr[i].charAt(0)=='i'|| strarr[i].charAt(0)=='o'|| strarr[i].charAt(0)=='u')
			{
				System.out.println(strarr[i]);
				count++;
			
			}
			
		}
		
		System.out.println(count);
		
		
		
		
	
		
		
		
		
		

	}
}
