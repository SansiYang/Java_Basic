package project6;

import utils.YcUtil;

public class test4_insert {

	public static void main(String[] args) {
		// ��������
		// ��������
		int[] x = new int[5];
		// �����ֵ
		YcUtil.genArray(x, 10);
		// ��ӡ����
		YcUtil.print(x);
		
		// ���������㷨
		for(int i=1;i<x.length;i++) {
			//ȡ����ǰδ�����ֵ
			int next=x[i];
			//��¼��ǰ�������Ԫ���������е�λ��
			int j=i;
			//��ʼ��ǰѭ��
			while(j>0) {
				if(x[j-1]<next) {
					break;
				}
				x[j]=x[j-1];
				j--;
			}
			//�ҵ���Ҫ�����λ��
			x[j]=next;
		}
		YcUtil.print(x);

	}

}
