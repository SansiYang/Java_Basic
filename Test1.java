package project3;

import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//关系运算符
		//
		Random r=new Random();
		int a=r.nextInt(10);
		int b=r.nextInt(10);
		System.out.println(a>b);//输出的是boolean(true/false)
		System.out.println(a+">"+b);
		System.out.println(a+">"+b+"---->"+(a>b));
		//与判断语气结合使用
		//需求：输入一个数，判断奇偶性
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个数：");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+"是偶数");
		}else {
			System.out.println(num+"是奇数");
		}
		}

}
