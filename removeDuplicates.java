
public class removeDuplicates {

	public static void main(String[] args) {
          String s ="ineeurroonn";
		
		s=s.replace(" ", "");
		
		int count=0;
		
		char []arr=s.toCharArray();
		
		
		System.out.println("The given string  : "+s);
		
		System.out.print("String After removing the duplicates :");
		
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
			
					count++;
					arr[j]=0;
					break;
					
				}

	 }
			
			 
  } 
		 
		 String s1=String.valueOf(arr);
		 
		 System.out.print(s1);
		 
		
		

	}

}
