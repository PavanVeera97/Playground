import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count=1;
      for(int temp=1;temp<=2*n;temp=temp+1)
      {
        if(count%2==1)
        {
          System.out.println(count);
          
      } count+=1;
      }
	}
}