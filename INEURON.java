package Names;

public class INEURON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int n=7;
		//outer loop
		for(int i=0; i<n; i++){
			
			// Inner loop1 
		    for(int j=0; j<n; j++) {
		    	
			 // code for I pattern
			    if((i==0 && j!=0 && j<n-1) || j==(n-1)/2 || (i==n-1 && j!=n-1 && j!=0)) {
			    	
			        System.out.print("*"); 
			  }
			   else {
				      System.out.print(" ");
			        }
			    }
		    
		    
		        // Inner loop2 
		      for(int j=0; j<n; j++) {
		    	
				 // code for N pattern
				    if(j==n/4 || (i==j && j!=0) || j==n-1) {
				    	
				        System.out.print("*"); 
				   }
				    else {
					     System.out.print(" ");
				  }
				    
			    }
		            
		           // Inner loop3 
		         for(int j=0; j<n; j++) {
			    	
					 // code for E pattern
					    if((i==0 && j!=0 && j<n-1) || (i==(n-1)/2 && j!=0 && j<n-1) || (i==n-1 && j!=0 && j<n-1) || (j==n/4) ) {
					    	
					        System.out.print("*"); 
					  
					 }
					  else {
						     System.out.print(" ");
					  }
					    
				    }
		         
		                   // Inner loop4
		              for(int j=0; j<n; j++) {
				    	
					 // code for U pattern
					     if((j==0 && i!=n-1) || (j==n-1 && i<n-1) || (i==n-1 && j!=0 && j<n-1)) {
					    	
					        System.out.print("*"); 
					    }
					    else {
						      System.out.print(" ");
					  }
					    
				    }
		              
		                  // Inner loop5 
		               for(int j=0; j<n; j++) {
					    	
							 // code for R pattern
							    if((i==0 && j<n-1 && j!=0) || (i==(n-1)/2 && j<n-1 && j!=0) || 
							    		(j==n-1 && i!=0 && i<(n-1)/2) || (j==n/4) 
					                     || (i==j && j>=(n-1)/2))
		            	  {
							    	
							        System.out.print("*"); 
							  
							 }
							 
							   else {
								 
							          System.out.print(" ");
							  }
							    
						    }
		                      // Inner loop6
		                    for(int j=0; j<n; j++) {
					    	
							 // code for O pattern
							    if((i==0 && j>n/4 && j!=n-1 ) || (j==n/4 && i>0 && i!=n-1) || (j==n-1 && i!=0 && i!=n-1) 
							    		|| (i==n-1 && j>n/4 && j!=n-1)){
							    	
							         System.out.print("*"); 
							  }
							    else {
								       System.out.print(" ");
							  }
							    
						    }
		                    
		                    
		                      // Inner loop7
		                    for(int j=0; j<n; j++) {
		        		    	
		       				 // code for N pattern
		       				    if(j==n/4 || (i==j & j!=0) || j==n-1) {
		       				    	
		       				        System.out.print("*"); 
		       				  }
		       				   else {
		       					 
		       				          System.out.print(" ");
		       				  }
		       				    
		       			    }
		                            // outer loop printing
		                             System.out.println();

	} 
		
		                 
}
}
