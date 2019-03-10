import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int base = in.nextInt();
	    // Take numbers from 2 to given number
	    int exponent = in.nextInt();
	    int power=power_no(base,exponent);
      System.out.print(power);
	}
	// Function to find the prime number
	public static int power_no(int base,int exponent)
	{
	    int power=1;
	    
	   
	        while(exponent>= 1)
	        {
	            power=power*base;
               exponent--;
	           
	        }  
	    
	    return power ;
	}
}// End of Main class