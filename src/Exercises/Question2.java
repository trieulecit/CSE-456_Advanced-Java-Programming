package Exercises;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		sc.close();
		
		System.out.println(isAscending(arr) ? "YES" : "NO");

	}
	public static boolean isAscending(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {	
			if(a[i] > a[i + 1])
				return false;
		}
		return true;
	}
	

}
