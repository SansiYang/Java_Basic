package project4;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		/*
		 �˵��ʺ���  do{
		 
		 	}while();
		 	��Ϊ����Ҫִ��һ��
		 */
		Scanner sc = new Scanner(System.in);
		
		boolean flag=true;
		do {
			System.out.println("**********");
			System.out.println("1����¼");
			System.out.println("2���޸�����");
			System.out.println("3���˳�");
			System.out.println("��ѡ��");
			int choise=sc.nextInt();
			if(choise==3) {
				System.out.println("�˳��ɹ���");
				flag=false;
			}
		}while(flag==true);

	}

}
