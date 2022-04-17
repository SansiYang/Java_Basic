package project3;

public class Test3 {

	public static void main(String[] args) {
		boolean x=true;
		boolean y=false;
		boolean z=true;
		//短路运算
		//   &&	   短路
		int a=10;
		int b=20;
		if(++a==12&&++b==10) {
			
		}
		System.out.println(a+"		"+b);
		
		//    &	    非短路
		a=10;
		if(++a==12&++b==10) {
			
		}
		System.out.println(a+"		"+b);

	}

}
