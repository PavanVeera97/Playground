import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  
  int option = n;
  switch(option)
  {
   case 1:
    
    System.out.println("one");
    break;
   case 2:
    
    System.out.println("two");
    break;
   case 3:
    
    System.out.println("Three");
    break;
   case 4:
    
    System.out.println("four");
    break;
   default:
    System.out.println("Invalid");
  }
	}
}