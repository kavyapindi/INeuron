
public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag=false;
		   String s1= "THE FIVE BOXING WIZARDS JUMPS QUICKLY";
		     s1 =s1.replace(" ", "");
	          System.out.println(s1);
	          
		      char[] ch1=s1.toCharArray();
		   
		      int [] arr= new int [26];
		      
		      for(int i=0; i<ch1.length; i++) {
		    	  int index=ch1[i]-65;
		    	  arr[index]++;
		    	  
		      }
		      
		    
		          for(int i=0; i<arr.length; i++) {
		            	if(arr[i]==0) {
		            		
		            		System.out.println("Not panagram");
		            		   flag=true;
		            		     break;
		            	}
		            	
		            }
		            if(flag==false) {
		            	
	            		System.out.println("panagram");
		      
		            }
		      

	}

}
