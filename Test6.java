package project3;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		//三元运算
		// x?y:z;
		boolean x=false;
		int y=1,z=2;
		System.out.println(x?y:z);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个数:");
		int num=sc.nextInt();
		
		System.out.println(  num%2==0?  "偶数":"奇数");
		String str=(num%2==0? "偶数":"奇数");
		System.out.println(num+"是"+str);
	}

}
