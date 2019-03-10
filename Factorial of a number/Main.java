import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
       Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    int copy_number = num;
	    
	    
	       
	        int fact = 1;
            
	        for(int count = 1; count <= num; count++)
	        {
	            fact = fact * count;
	        }
	     System.out.println(fact);
        
	}
}