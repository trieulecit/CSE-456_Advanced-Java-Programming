package Exercises;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long res = 1;
		for (int i = 2; i <= n; i++) {
			res *= i;
		}
		System.out.println(res + 1);
		sc.close();

	}

}
