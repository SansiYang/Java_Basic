package project3;

import java.util.Scanner;

public class Test9 {

	// ���峣�� �����Ժ��޸�����
	private static final double RATE1 = 0.15;
	private static final double RATE2 = 0.28;
	private static final double RATE3 = 0.31;

	private static final double SINGLE_BRACKET1 = 20450;
	private static final double SINGLE_BRACKET2 = 51900;

	private static final double MARRIDE_BRACKET1 = 35800;
	private static final double MARRIDE_BRACKET2 = 86500;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���������״�����ѻ�������1��δ��������0:");
		int status = sc.nextInt();
		if (status != 0 && status != 1) {
			System.out.println("�������");
		}
		System.out.print("������������룺");
		int income = sc.nextInt();

		if (status == 0) {
			if (income < SINGLE_BRACKET1) {
				System.out.println("��Ӧ����˰��Ϊ��" + income * RATE1);
			} else if (income >= SINGLE_BRACKET1 && income < SINGLE_BRACKET2) {
				System.out.println("��Ӧ����˰��Ϊ��" + income * RATE2);
			} else {
				System.out.println("��Ӧ����˰��Ϊ��" + income * RATE3);
			}
		} else if (status == 1) {
			if (income < MARRIDE_BRACKET1) {
				System.out.println("��Ӧ����˰��Ϊ��" + income * RATE1);
			} else if (income >= MARRIDE_BRACKET2 && income < SINGLE_BRACKET2) {
				System.out.println("��Ӧ����˰��Ϊ��" + income * RATE2);
			} else {
				System.out.println("��Ӧ����˰��Ϊ��" + income * RATE3);
			}
		}
	}

}
