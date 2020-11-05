
public class iterators {
   
	public static void main(String[] args) {
		int a= 100;
	    boolean notHighEnough = true;
	
	    
	        while(notHighEnough) {
	            System.out.println("a: "+a);
	            a++;
	
	            if(a > 200) {
	                notHighEnough = false;
	            }
	        }
	
	        System.out.println("We've reached 200!");
	    
	     int x =100;
	     boolean oddEven = true;
	     
			/*
			 * do { x++; if(x%2=0) { System.out.println(x+" is Even"); }else {
			 * System.out.println(x+" is odd"); } } while
			 */
	     
	     for (int i=100; i <201; i++) {
	    	 if(i%2<=0) {
	    		 System.out.println(i+" is even!(-)");
	    	 } else {
	    		 System.out.println(i+" is odd!(*)");
	    	 }
	     }
	     
	     for (int n=1; n<=10; n++) {
	    	 System.out.println("1,2,3,4,5,6,7,8,9,10");
	     }
	        
    }
}
