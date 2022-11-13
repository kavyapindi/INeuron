import java.util.Arrays;

public class UniqueChar {
	

	public boolean check(String s) {
		
		char [] arr = s.toCharArray();
		
		Arrays.sort(arr);
		
			
		  for(int i=1; i<arr.length; i++) {
				
				
				if(arr[i]==arr[i-1]) {
						
					  return true;
						
			}
         }
		     return false;    
		  
		  
		
	}
	
 public static void main(String[] args) {
	 
	 String s= "ineuro";
	 
	 s=s.replace(" ", "");
	 
	 
	 UniqueChar u= new UniqueChar();
		
	boolean	res=u.check(s);
		
		if(res==false) {
			
			System.out.println(" All unique characters");
			
		}else
			System.out.println("Not unique characters ");
	
    }
  
}
