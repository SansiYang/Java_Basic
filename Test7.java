package project3;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		//输入人名
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个人名：");
		String name=sc.nextLine();
		if(name.length()<2) {
			System.out.println("名字不合法！");	
			return;
		}
		System.out.println("欢迎你，"+name+"!");
		
	}

}
