package project1;

public class Test6 {
	public static void main(String[ ] args) {
		char ch1=97;
		System.out.println(ch1);
		
		
		int i;
		for(i=0;i<=65535;i++) {
			
			System.out.print( i +"+" +(char)i+  "\t" );
		if(i%10==0) {
				System.out.println();
			}
		}
	}

}
