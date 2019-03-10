import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
       Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
      int strlen=str.length();
      int front=0;
      int end=strlen-1;
      boolean palindrome=true;
      while(front<end){
        if(str.charAt(front)!=str.charAt(end)){
          palindrome=false;
          break;
        }
        front++;
        end--;
      }
      if(palindrome==true){
        System.out.print("Yes");
      }
      else{
System.out.print("No");}
    } 
}