package project4;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		/*
		 菜单适合用  do{
		 
		 	}while();
		 	因为必须要执行一次
		 */
		Scanner sc = new Scanner(System.in);
		
		boolean flag=true;
		do {
			System.out.println("**********");
			System.out.println("1、登录");
			System.out.println("2、修改密码");
			System.out.println("3、退出");
			System.out.println("请选择：");
			int choise=sc.nextInt();
			if(choise==3) {
				System.out.println("退出成功！");
				flag=false;
			}
		}while(flag==true);

	}

}
