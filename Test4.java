package project2;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//System.out.print("������Ҫ���ܵ����֣�");
		//String ch=sc.nextLine();
		char ch='��';
		System.out.println("��������Կ��");
		int key=sc.nextInt();
		char ch1=(char)(ch+key);
		System.out.println("���ܺ�Ϊ��"+ch1);
		System.out.println("����ǰΪ��"+ ch);
	}

}