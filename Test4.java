package project3;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		int a=2;
		a+=2;
		System.out.println(a);
		a*=2;
		System.out.println(a);
		
		//���������������������������ֵ
		System.out.println("�������������֣�");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(x+"\t"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+"\t"+y);

	}

}
