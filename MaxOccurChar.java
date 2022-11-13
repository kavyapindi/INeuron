
public class MaxOccurChar {

	public static void main(String[] args) {
		
		String s1="this is java tutorial";
		s1=s1.replace(" ", "");
		
	//	char [] s2=s1.toCharArray();
		
		int[] arr=new int[256];
		 int max =0; 
		 char res=' ';
		
		for(int i=0; i<s1.length(); i++) {
			
              arr[s1.charAt(i)]++;
              
              if(arr[s1.charAt(i)] > max) {
            	  
            	 max= arr[s1.charAt(i)];
            	  res=s1.charAt(i);
            	  
              }
              
      }       
		       
		
		System.out.print("Maximum occurring character is : " +res);	 
				 
			 
				 
			  
			 
	}   
	
}

