package project2;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//System.out.print("请输入要加密的文字：");
		//String ch=sc.nextLine();
		char ch='杨';
		System.out.println("请输入密钥：");
		int key=sc.nextInt();
		char ch1=(char)(ch+key);
		System.out.println("加密后为："+ch1);
		System.out.println("加密前为："+ ch);
	}

}