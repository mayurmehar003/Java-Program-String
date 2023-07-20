//what duplicate word in sentence and its occurance
package day1;

class Program1s
{
	
		public static void main(String[] args) {
		
				
		String str="Mayur Mehar Mayur mayur";
		
		String str1=str.toLowerCase();
		
		String[] newstr=str1.split(" ");
		
		for(int i=0;i<=newstr.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<=newstr.length-1;j++)
			{
				if(newstr[i].equals(newstr[j]))
				{
					
					count++;
				}
			}
			
			if(count>1)
			{
				System.out.println(newstr[i]+" : "+count);
			}
		}
		
		
		
		
		

	

	}
}
