//Calculate the sum of digit in sentence
package day1;
class Program6S
{
	
		public static void main(String[] args) {
		
			
		String str="Madam  89ok notok  aeii";
		
		String newstr="";

         for(int i=0;i<=str.length()-1;i++)
		 {
			 if(str.charAt(i)>='0' && str.charAt(i)<='9')
			 {
				 newstr=newstr+str.charAt(i);
			 }
		 }		

         int num=Integer.parseInt(newstr);	
 
          int sum=0;
          while(num!=0)
          {
			  int last=num%10;
			  sum=sum+last;
			  num=num/10;
		  }		

          System.out.println(sum);		  
	
		
		
	
		
		
		
		
		

	}
}
