
public class VcscCount {
	
	public static void main(String[] args) {
		String str= "Java is programing language %$#&";
		String vowels ="";
		String consonants="";
		int vCount=0;
		int cCount=0;
		int scCount=0;
		
		str=str.toLowerCase();
		str=str.replace(" ","");
		 
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ) {
               
				vowels=vowels+str.charAt(i);
				vCount++;
				
				
			
			}else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				consonants=consonants+str.charAt(i);
				
				cCount++;
				
			}else
				scCount++;

				
		}
		
		System.out.println("num of vowels : "+ vCount + " : "+ vowels);
		System.out.println("num of consonants : "+ cCount +  " : "+ consonants);
		System.out.println("num of special char : "+ scCount);
   
			
			
			
		
		
		
		

	}

}
