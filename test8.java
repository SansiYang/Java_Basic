package project5;

import java.util.Random;

public class test8 {

	public static void main(String[] args) {
		// ��һ������
		int [] x=new int[] {1,5,7,9};
		
		//���������x�г�ȡԪ�أ�Ҫ��ÿ�γ�Ĳ�һ������ȡ���������鳤һ����
		Random r=new Random();
		int b=x.length;
		
		for(int i= 0;i<x.length;i++) {
		int a=r.nextInt(b);
		System.out.println(x[a]);
		int temp=x[a];
		x[a]=x[x.length-1];
		x[x.length-1]=temp;
		b--;
		}
	}

}
