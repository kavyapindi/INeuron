import java.util.Arrays;

public class Duplicates {

	public static void main(String[] args) {
		String s ="ineeurrooon";
		
		s=s.replace(" ", "");
		
		int count=0;
		
		char []arr=s.toCharArray();
		
		
		System.out.println("The given string is : "+ s);
		
		System.out.print("Duplicates characters present in the String are : ");
		
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.print(arr[j] + " ");
					count++;
					arr[j]=0;
					break;
					
				}
                  
			
			      
 } 
		
		 }
	    	  
	     
		    
	}

}











