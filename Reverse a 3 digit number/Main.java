import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int num=in.nextInt();
    int first=num/100;
    int second=((num/10)%10);
    int third=num%10;
    int Rev=(third*100)+(second*10)+(first);
    System.out.println(Rev);
  }
}