package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		*/
		//int n = sc.nextInt();
		int a = 100;
		int b = 999;
		int sum = 0;
		while(a <= b) {
			if (a % 3 == 0) {
				System.out.println(a);
				a++;
			}
		}
	}
}
