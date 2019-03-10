import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str1 = scan.nextLine();
        int str_len = str.length();
        int str_len1 = str1.length();
        int count=0;
    for(int i=0;i<(str_len-str_len1+1);i++){
      boolean matching=true;
      for(int j=0;j<str_len1;j++){
        if(str.charAt(i+j)!=str1.charAt(j)){
          matching= false;
        }
      }
      if(matching==true){
        count++;}
    }
    System.out.print(count);
    
    
  } 
}