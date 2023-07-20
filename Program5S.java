//Calculate the sum of digit in sentence
package day1;
class Program5S
{
	
		public static void main(String[] args) {
		
			
		String str="Madam  89ok notok";
		
		
		
		int sum=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
			{
				sum=sum+Character.getNumericValue(ch);    //conver character into numeric value
			}
		}
		
		System.out.println(sum);
		
		
		

	}
}
