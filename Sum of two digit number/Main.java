import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n2 = n%10;
		int n3 = n/10;
		int avg =  n2 + n3;
		System.out.println(avg);
	}
}