import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    int copy_number = num;
      int digit_count=0;
	    int sum = 0;
	    while(num > 0){
          digit_count++;
	        num = num /10;
        }
      int pow=1;
      num = copy_number;
      while(num>0)
      {
            int rem = num%10;
	        for(int count = 1; count <= digit_count; count++)
	        {
	            pow=pow*rem;
	        }
	        sum = sum + pow;
        pow=1;
	        num = num / 10;
	    }
	    if(copy_number == sum)
	    {
	        System.out.println("Armstrong Number");
	    }
	    else{
	        System.out.println("Not a Armstrong Number");
	    }
	}
}