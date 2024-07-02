package june18arrays;

public class demo4 {

	public static void main(String[] args) {
		
		int [] arr = {4,7,1,75,31,72} ;
		
		//you have to find maximum and minimum element in this array 
		
		int max = arr[0] ;
		int min = arr[0] ;
		
		for (int a  : arr) {
			
			if(a>max) {
				max = a ;
			}
			if(a<min) {
				min = a ;
			}
			System.out.println("max is " +max) ;
			System.out.println("min is " +min) ;
			
			
				
			}
			
		}
		         
		
		

	}

