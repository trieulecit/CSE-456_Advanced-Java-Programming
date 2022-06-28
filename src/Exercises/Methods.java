package Exercises;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = input();
		output(arr);

		int[] newArr = deleteDuplicate(arr);

		output(newArr);

	}

	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		sc.close();
		return a;
	}

	public static void output(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int count(int[] a, int x) {
		int count = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] < x) // Flexible condition.
				count++;
		return count;
	}

	public static int findMin(int[] a) {
		int minPos = 0;
		for (int i = 1; i < a.length; i++) {

			if (a[i] < a[minPos])
				minPos = i;

		}
		return minPos;
	}

	public static int findXsPosition(int[] a, int x) {
		for (int i = 0; i < a.length; i++)
			if (a[i] == x)
				return i;
		return -1;
	}

	public static int findMaxValue(int[] a) {
		int maxVal = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > maxVal)
				maxVal = a[i];
		return maxVal;
	}

	public static boolean checkExistence(int[] a, int x) {
		for (int i = 0; i < a.length; i++)
			if (a[i] == x)
				return true;
		return false;
	}

	public static void sort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
	}

	public static int[] insertXintoPos(int[] a, int x, int pos) {
		int[] e = new int[a.length + 1];
		int i;
		for (i = 0; i < pos; i++)
			e[i] = a[i];
		e[pos] = x;
		for (i = pos + 1; i < e.length; i++)
			e[i] = a[i - 1];
		return e;
	}

	public static int[] deleteAt(int[] a, int pos) {
		int[] e = new int[a.length - 1];
		int i;
		for (i = 0; i < pos; i++)
			e[i] = a[i];
		for (i = pos; i < e.length; i++) {
			e[i] = a[i + 1];
		}
		return e;
	}

	public static int[] deleteDuplicate(int[] a) {
		int n = a.length;
		int[] e = new int[n];

		for (int i = 0; i < n; i++) {
			e[i] = a[i];
		}
		int i, j;
		for (i = 0; i < e.length - 1; i++) {
			for (j = i + 1; j < e.length; j++) {
				if (e[j] == e[i]) {
					e = deleteAt(e, j);
					j--;
				}
			}
		}
		return e;
	}
}
