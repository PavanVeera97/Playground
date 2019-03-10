import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int first_digit;
      first_digit = n;
      while(first_digit>=100)
      {
        first_digit =first_digit/10;
      }
      first_digit=first_digit%10;
      System.out.println(first_digit);
    }
}