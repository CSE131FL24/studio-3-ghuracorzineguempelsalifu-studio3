package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is n?");
		int n = in.nextInt();

		boolean[] array = new boolean[n + 1];

		for (int i = 0; i < n + 1; i++) {
			array[i] = true;
		}

		for (int i = 2; i < n; i++) {
			for (int a = i*2; a < n; a = a + i) {
				array[a] = false;
			}
		}
		for (int i = 2; i < n; i++) {
			if (array[i] == true) {
				System.out.println(i);
			}
		}
	}
}
