package project3;

public class Test5 {

	public static void main(String[] args) {
		//位运算符
		//左移  <<
		//  二元运算  操作数<<位数
		int x=5;
		System.out.println(x<<1);  //10    101-->1010		5*2
		System.out.println(x<<2);  //20    101-->10100		5*2*2
		System.out.println(x<<3);  //40    101-->101000		5*2*2*2
		
		//右移
		x=40;
		System.out.println(x>>1);  //
		System.out.println(x>>2);  //
		System.out.println(x>>3);  //
		
		//按位与  &
		int a = 5;
		int b = 3;
		System.out.println(a&b);
		//0101
		//0011
		//0001
		
		//按位或  |
		System.out.println(a|b);
		//0101
		//0011
		//0111
		
		//按位异或
		System.out.println(a^b);
		//0101
		//0011
		//0110
		//1.交换性
		System.out.println(b^a);
		//2.结合性
		int c=2;
		System.out.println(a^b^c);
		System.out.println(a^(b^c));
		//3.自反性
		System.out.println(a^b^b);
		
		//利用自反性交换两个数的值,不需要引入第三个变量
		System.out.println(a+"\t"+b);
		a=a^b;
		//101
		//011
		//110
		b=b^a;
		//011
		//110
		//101
		a=a^b;
		//110
		//101
		//011
		System.out.println(a+"\t"+b);
	}

}
