import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		String s1="2552";
		String s2="";
		
		for(int i=(s1.length())-1; i>=0; i--) {
			
			s2=s2 + s1.charAt(i); 
			
		}
		  if(s1.equals(s2)) {
			  
			  System.out.println("The given String s1 is a palindrome of s2");
			  
		  }else 
		       
			  System.out.println("The given String s1 is not a palindrome of s2");
		
				  
	}
		  
		  
	  } 
	    
	
	


