package project3;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//����һ������ж��ǲ�������
		//����һ��  ���겻��   �İ�������
		System.out.print("��������ݣ�");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year<=0||year>3000) {
			System.out.println("����������");
			return;
		}
		if((year%4==0  && year%100!=0)  ||  (year%400==0)  ) {
			System.out.println(year+"������");
		}else {
			System.out.println(year+"��ƽ��");
		}
		

	}

}
