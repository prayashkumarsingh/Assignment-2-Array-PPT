package in.ineuron.question7;

import java.util.Scanner;

public class Question7 {
	public static boolean monotonic(int[] A) {
		int store = 0;
		for (int i = 0; i < A.length - 1; ++i) {
			int c = Integer.compare(A[i], A[i + 1]);
			if (c != 0) {
				if (c != store && store != 0)
					return false;
				store = c;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");

		int n = sc.nextInt();

		int[] nums = new int[n];
		System.out.println("Enter the elements of the array nums: ");
		for (int i = 0; i < n; i++) {

			nums[i] = sc.nextInt();
		}
		System.out.println(monotonic(nums));
	}

}
