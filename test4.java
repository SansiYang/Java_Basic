package project5;

import java.util.Random;
import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		//��һ�������в���ĳ��Ԫ�أ�������������������-1
		int [] x=new int[20];
		genArray(x);
		System.out.println("���ԭʼ����ֵ��");
		print(x);
		Scanner sc=new Scanner(System.in);
		System.out.print("������Ҫ���ҵ�ֵ��");
		int num=sc.nextInt();
		int i;
		for(i=0;i<x.length;i++) {
			if(num==x[i]) {
				System.out.println("��"+i+"���ҵ���"+x[i]);
				break;
			}
			if(i>=x.length) {
				System.out.println("û���ҵ�"+num);
			}
		}
	}
	
	//�����������ֵ
	static void genArray(int[] y) {
		for (int i = 0; i < y.length; i++) {
			Random r = new Random();
			int a = r.nextInt(101);
			y[i] = a;
		}
	}
	
	//�������Ԫ��
	static void print(int[] y) {
		for (int ele : y) {
			System.out.print(ele + "\t");
		}
		System.out.println();
	}

}
