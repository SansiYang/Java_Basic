package project4;

public class test10 {

	public static void main(String[] args) {
		int i;
		boolean isprime=true;
		for( i=2;i<=100;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isprime=false;
					break;
				}
			}
		}
		if(isprime) {
			System.out.println(i+"是素数。");
		}else {
			System.out.println(i+"不是素数。");
		}

	}

}
