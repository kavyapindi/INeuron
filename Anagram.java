import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="A Gentle man";
		String s2="elegant man";
		String ss1="";
		
		s1=s1.replace(" ", "");
		s2=s2.replace(" ", "");
		
		
		// code to convert s1 string to  Lowercase
         for(int i=0; i<s1.length(); i++) {
        	 
        	 if(s1.charAt(i)>='A' && s1.charAt(i)<='Z') {
        	 
        	 ss1=ss1+(char)(s1.charAt(i)+32); 
        	
        	 }  else
        		 ss1=ss1+(char)(s1.charAt(i));
         }
        
    System.out.println(ss1);
         
         //code for sorting the  array c1
         
         char [] c1= ss1.toCharArray();
         char [] c2= s2.toCharArray();
         
         for(int i=0; i<c1.length; i++) {
        	 
        	 for(int j=1; j<c1.length-i; j++) {
        		 
        		 if(c1[j]<c1[j-1]) {
        			 
        			 char temp=c1[j-1];
        			   c1[j-1]=c1[j];
        			   c1[j]=temp;
        			 }
        		}
        }
            
       //code for sorting the  array c1
         
           for(int i=0; i<c2.length; i++) {
          	 
          	 for(int j=1; j<c2.length-i; j++) {
          		 
          		 if(c2[j]<c2[j-1]) {
          			 
          			 char temp=c2[j-1];
          			   c2[j-1]=c2[j];
          			   c2[j]=temp;
          			 }
          		}
          }
               
               
            
           //code to check Anagram
           
                if(Arrays.equals(c1,c2)) {
                
                	System.out.println("It is an Anagram"); 
                }else
            
            	 System.out.println("It is not an Anagram");
            	
            }
                
            	 }
             
		
            
		
	 


