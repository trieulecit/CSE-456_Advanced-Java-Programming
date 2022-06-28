package Exercises;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int k = sc.nextInt();
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		sc.close();
		
		System.out.println(countItems(arr, k));

	}
	public static int countItems(int[] a, int k) {
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] <= k)
				count++;
		}
		return count;
	}

}
