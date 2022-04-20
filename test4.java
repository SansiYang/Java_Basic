package project5;

import java.util.Random;
import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		//从一个数组中查找某个元素，如有则输出，无则输出-1
		int [] x=new int[20];
		genArray(x);
		System.out.println("输出原始数组值：");
		print(x);
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入要查找的值：");
		int num=sc.nextInt();
		int i;
		for(i=0;i<x.length;i++) {
			if(num==x[i]) {
				System.out.println("在"+i+"号找到了"+x[i]);
				break;
			}
			if(i>=x.length) {
				System.out.println("没有找到"+num);
			}
		}
	}
	
	//随机生成数组值
	static void genArray(int[] y) {
		for (int i = 0; i < y.length; i++) {
			Random r = new Random();
			int a = r.nextInt(101);
			y[i] = a;
		}
	}
	
	//输出数组元素
	static void print(int[] y) {
		for (int ele : y) {
			System.out.print(ele + "\t");
		}
		System.out.println();
	}

}
