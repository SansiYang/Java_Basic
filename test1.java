package project6;

import utils.YcUtil;

public class test1 {

	public static void main(String[] args) {

		// ð������
		// ��������
		int[] x = new int[5];
		// �����ֵ
		YcUtil.genArray(x, 10);
		// ��ӡ����
		YcUtil.print(x);
		// ð�������㷨
		for (int i = 0; i < x.length - 1; i++) { // ��ѭ�� ѭ�� Ԫ�ظ���-1 ��
			for (int j = 1; j < x.length - i; j++) { // ��ѭ�� ÿ��ѭ�������һ��
				if (x[j - 1] > x[j]) {
					int temp = x[j];
					x[j] = x[j - 1];
					x[j - 1] = temp;
				}
			}
		}
		System.out.println("�ź�������飺");
		YcUtil.print(x);

	}

}
