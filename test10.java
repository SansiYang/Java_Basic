package project5;

import java.util.Random;

public class test10 {
	//�����ʼ��52��Ԫ��   0--51
	//���������a��0--51  �������p[a] 
	//���������p[4],��p[4]���������p[51]������
	//Ϊ�˲����ظ���������ɵ��������ֻ����0--51��

	public static void main(String[] args) {
		//�������� �����鸳ֵ
		int[] p = new int[52];
		for (int i = 0; i <= p.length - 1; i++) {
			p[i] = i;
		}
		
		
		int b = p.length;
		for (int i = 0; i <= p.length - 1; i++) {
			Random r = new Random();
			int a = r.nextInt(b);
			System.out.println(p[a] + "\t" + hua(p[a]) + hao(p[a]));
			//��������ķŵ���������
			int c = p[b-1];
			p[b-1] = p[a];
			p[a] = c;
			b = b - 1;	//�����������������
		}
	}

	// �ж��ƵĻ�ɫ
	static String hua(int a) {
		String huase = " ";
		if (a >= 0 && a < 13) {
			huase = "����";
		} else if (a >= 13 && a < 26) {
			huase = "÷��";
		} else if (a >= 26 && a < 39) {
			huase = "����";
		} else if (a >= 39 && a < 52) {
			huase = "����";
		}
		return huase;
	}

	// �ж��Ƶ�����
	static String hao(int a) {
		String paihao = " ";
		switch (a % 13 + 1) {
		case 1:
			paihao = "A";
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			paihao = (a % 13 + 1) + "";
			break;
		case 11:
			paihao = "J";
			break;
		case 12:
			paihao = "Q";
			break;
		case 13:
			paihao = "K";
			break;
		default:
			System.out.println(a + "�������");
		}
		return paihao;
	}

}
