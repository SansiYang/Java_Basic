package project6;

public class test3_bank {

	public static void main(String[] args) {
		int n = 5;
		// �����
		double[][] load = new double[][] { { 0, 100.5, 0, 0, 320.5 }, { 0, 0, 40, 85, 0 }, { 125, 0, 0, 75, 0 },
				{ 125, 0, 0, 0, 0 }, { 0, 0, 125, 0, 0 } };
		// ���
		double[] balances = new double[] { 25, 125, 175, 75, 181 };
		// ���ʲ�
		double[] assets = new double[n];
		// �ж��Ƿ�ȫ
		boolean[] isSafe = new boolean[n];
		// ��ʼ����ȫ�ж�
		for (int i = 0; i < isSafe.length; i++) {
			isSafe[i] = true;
		}
		// ��ȫ��
		double limit = 201;

		boolean hasNewUnsafe = false;

		do {
			hasNewUnsafe = false;
			for (int i = 0; i < n; i++) {
				assets[i] = balances[i];
				for (int j = 0; j < n; j++) {
					assets[i] += load[i][j];
				}
				if (isSafe[i] && assets[i] < limit) {
					hasNewUnsafe = true; // ����ҵ����µĲ���ȫ������
					isSafe[i] = false;
					System.out.println(i + "�������ǲ���ȫ�ģ������ʲ��ǣ�" + assets[i]);
					// ���load���±�Ϊ i ��һ�����е�ֵΪ0
					// ����i�е�ֵ��Ϊ0
					for (int k = 0; k < n; k++) {
						load[k][i] = 0;
					}
				}
			}

		} while (hasNewUnsafe);
		// Ѱ��һ�Ҳ���ȫ������

	}

}


/*
 * ���ҵ�һ�Ҳ���ȫ������
 * �ٽ�����������й�ϵ���������е��ʲ�����
 * �ٴ��ж��������е��ʲ����
 * ���ǻ��в���ȫ������
 * �ٸĺ����������ص����е��ʲ� 
 *  */
