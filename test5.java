package project5;

import java.util.Random;
import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		int [] x=new int[20];
		genArray(x);
		print(x);
		find(x);

	}
	//查找数组里面的数
	static void find(int [] y) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入要查找的值：");
		int num=sc.nextInt();
		int i;
		for(i=0;i<y.length;i++) {
			if(num==y[i]) {
				System.out.println("在"+i+"号找到了"+y[i]);
				break;
			}
			if(i>=y.length) {
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
