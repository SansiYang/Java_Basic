package project5;

import java.util.Random;

public class test2 {

	public static void main(String[] args) {
		//���������
		int [] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		//��������1
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		//��ǿ�����
		for(int ele:arr) {		//������arr��ÿ��ȡ��һ��Ԫ�� int �ŵ�����ele��
			System.out.print(ele+"\t");
		}
		System.out.println();
		//�������arr�е�ֵ
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		//�����������������������ĸ�ֵ
		Random r=new Random();
		for(int i=0;i<arr.length;i++) {
			int x=r.nextInt(32);
			arr[i]=x;
		}
		for(int ele:arr) {
			System.out.print(ele+"\t");
		}

	}

}
