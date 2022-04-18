package project4;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		/*
		 * switch(数值类型的变量 int/char/short){ case 值1： 语句; break; case 值2： 语句; break; case
		 * 值3： 语句; break; . . . default : 语句;
		 * 
		 * }
		 */

		// 月份有多少天
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = sc.nextInt();

		// 方案1
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("这个月有31天。");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("这个月有30天。");
		} else if (month == 2) {
			System.out.println("这个月有29天或者28天。");
		} else {
			System.out.println("没有这个月份！");
		}

		// 方案二
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "月有31天。");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "月有29天或者28天。");
			break;
		case 2:
			System.out.println(month + "月有30天。");
			break;

		}

	}

}
