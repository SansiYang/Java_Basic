package project6;

import utils.YcUtil;

public class test2 {

	public static void main(String[] args) {
		// ѡ������
		// ��������
		int[] x = new int[5];
		// �����ֵ
		YcUtil.genArray(x, 10);
		// ��ӡ����
		YcUtil.print(x);
		// ѡ�������㷨
		System.out.println("�����������Ϊ��"+findMaxIndex(x,1));
		
		for(int i=0;i<x.length-1;i++) {
			int maxIndex=findMaxIndex(x,i);
			if(x[maxIndex]!=i) {
				int temp=x[maxIndex];
				x[maxIndex]=x[i];
				x[i]=temp;
			}
		}
		System.out.println("ѡ������Ľ��Ϊ��");
		YcUtil.print(x);

	}
	
	static int findMaxIndex(int []x,int from) {
		int maxIndex=from;
		for(int i=from+1;i<x.length;i++) {
			if(x[i]>x[maxIndex]) {
				maxIndex=i;
			}
		}
		return maxIndex;
	}
	

}
