package project4;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		/*
		 * switch(��ֵ���͵ı��� int/char/short){ case ֵ1�� ���; break; case ֵ2�� ���; break; case
		 * ֵ3�� ���; break; . . . default : ���;
		 * 
		 * }
		 */

		// �·��ж�����
		Scanner sc = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int month = sc.nextInt();

		// ����1
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("�������31�졣");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("�������30�졣");
		} else if (month == 2) {
			System.out.println("�������29�����28�졣");
		} else {
			System.out.println("û������·ݣ�");
		}

		// ������
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "����31�졣");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "����29�����28�졣");
			break;
		case 2:
			System.out.println(month + "����30�졣");
			break;

		}

	}

}
