package project1;

public class Test7 {

	public static void main(String[] args) {
		int i;
		for(i=0;i<=65535;i++) {
			if(i%10==0) {
				System.out.println();
			}
			System.out.print(i+  "=" + (char)i + "\t" );
		}

	}

}
