package project2;

public class Test2 {

	public static void main(String[] args) {
		int a=10,c;
		char b='语';
		c=a+b;
		System.out.println( (int)b );//强制转换 b 为 int 型 
		System.out.println(  c  );   //因为 c 为 int 型，所以输出的还是数字
		System.out.println((char)c); //

	}

}
