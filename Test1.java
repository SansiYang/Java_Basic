package project3;

import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//��ϵ�����
		//
		Random r=new Random();
		int a=r.nextInt(10);
		int b=r.nextInt(10);
		System.out.println(a>b);//�������boolean(true/false)
		System.out.println(a+">"+b);
		System.out.println(a+">"+b+"---->"+(a>b));
		//���ж��������ʹ��
		//��������һ�������ж���ż��
		Scanner sc=new Scanner(System.in);
		System.out.print("������һ������");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+"��ż��");
		}else {
			System.out.println(num+"������");
		}
		}

}
