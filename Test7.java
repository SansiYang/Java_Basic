package project3;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		//��������
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������");
		String name=sc.nextLine();
		if(name.length()<2) {
			System.out.println("���ֲ��Ϸ���");	
			return;
		}
		System.out.println("��ӭ�㣬"+name+"!");
		
	}

}
