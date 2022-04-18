package project4;

public class test8 {

	public static void main(String[] args) {

		// 1
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");

		// 2
		int i = 1;
		int j = 1;
		for (i = 1; i <= 5; i++) {
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");

		// 3
		for (i = 1; i <= 5; i++) {
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			for (j = 1; j <= 2 * i - 1; j++) {
				if (j == 1 || j == 2 * i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");

	}

}
