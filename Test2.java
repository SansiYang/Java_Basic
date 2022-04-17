package project3;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//输入一个年份判断是不是闰年
		//四年一闰  百年不闰   四百年再闰
		System.out.print("请输入年份：");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year<=0||year>3000) {
			System.out.println("年份输入错误！");
			return;
		}
		if((year%4==0  && year%100!=0)  ||  (year%400==0)  ) {
			System.out.println(year+"是闰年");
		}else {
			System.out.println(year+"是平年");
		}
		

	}

}
