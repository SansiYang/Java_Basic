package project5;

import java.util.Random;
import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		int [] arr=new int[10];
		System.out.println("����������������ķ�Χ��");
		Scanner sc=new Scanner(System.in);
		int bound=sc.nextInt();
		genArray(arr,bound);
		System.out.println("����Ϊ��");
		print(arr);
		System.out.println("������Ҫ���ҵ�����");
		int num=sc.nextInt();
		
		int start=0;
		int index=find(arr,num,start);
		if(index!=-1) {
			System.out.println("��������"+num+"���Ԫ��");
		}
		
		
	}
	//�����������ֵ
		static void genArray(int[] y,int bound) {
			for (int i = 0; i < y.length; i++) {
				Random r = new Random();
				int a = r.nextInt(bound);
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
		
		//�����������Ԫ��
		static int find(int[]y,int num,int start) {
			int index=-1;
			for(int i=0;i<y.length;i++) {
				if(y[i]==num) {
					return i;
				}
			}
			return index;
		}


}
