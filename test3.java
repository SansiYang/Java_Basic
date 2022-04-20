package project5;

import java.util.Random;

public class test3 {

	public static void main(String[] args) {
		int[] x = new int[10] ;

		

		genArray(x);
		print(x);

	}

	static void genArray(int[] y) {
		for (int i = 0; i < y.length; i++) {
			Random r = new Random();
			int a = r.nextInt(101);
			y[i] = a;
		}
	}

	static void print(int[] y) {
		for (int ele : y) {
			System.out.print(ele + "\t");
		}
		System.out.println();
	}

}
