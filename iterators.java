
public class iterators {
   
	public static void main(String[] args) {

	   coins(4.58);  
	   
	} 
	public static void excercises() {

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
	     
	     for (int r = 0; r < 11; r++) {
	         for (int c = 0; c <= r; c++) {
	           System.out.print( "r");
	         }
	         System.out.println();
	       }
	}
	
	public static void coins(double cost) {
		double payment = 20.0;
		double currentTotal = payment - cost;
		System.out.println("Your total change is "+currentTotal);
		do {
			if(currentTotal>=10.0) {
				currentTotal = currentTotal-10.0;
				
				System.out.println("1 £10 note: remaining change is "+currentTotal);
				
			}else if (currentTotal>5.0) {
				currentTotal = currentTotal -5.0;
				System.out.println("1 £5 note: remaining change is "+currentTotal);
			}else if (currentTotal>1.0) {
				currentTotal = currentTotal -1.0;
				System.out.println("1 £1 coin: remaining change is "+currentTotal);
			}else if (currentTotal>0.50) {
				currentTotal = currentTotal -0.5;
				System.out.println("1 50p coin: remaining change is "+currentTotal);
			}else if (currentTotal>0.2) {
				currentTotal = currentTotal -0.2;
				System.out.println("1 20p coin: remaining change is "+currentTotal);
			}else if (currentTotal>0.1) {
				currentTotal = currentTotal -0.1;
				System.out.println("1 10p coin: remaining change is "+currentTotal);
			}else if (currentTotal>0.05) {
				currentTotal = currentTotal -0.05;
				System.out.println("1 5p coin: remaining change is "+currentTotal);
			}else if (currentTotal>0.02) {
				currentTotal = currentTotal -0.02;
				System.out.println("1 2p coin: remaining change is "+currentTotal);
			}else if (currentTotal>0.01) {
				currentTotal = currentTotal -0.01;
				System.out.println("1 1p coin: remaining change is "+currentTotal);
			}
		}while(currentTotal >= 0.0);
	}
}
