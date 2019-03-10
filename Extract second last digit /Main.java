import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n2 = n%100;
		int n3 = n2/10;
		
		System.out.println(n3);
	}
}