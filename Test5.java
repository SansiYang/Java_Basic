package project3;

public class Test5 {

	public static void main(String[] args) {
		//λ�����
		//����  <<
		//  ��Ԫ����  ������<<λ��
		int x=5;
		System.out.println(x<<1);  //10    101-->1010		5*2
		System.out.println(x<<2);  //20    101-->10100		5*2*2
		System.out.println(x<<3);  //40    101-->101000		5*2*2*2
		
		//����
		x=40;
		System.out.println(x>>1);  //
		System.out.println(x>>2);  //
		System.out.println(x>>3);  //
		
		//��λ��  &
		int a = 5;
		int b = 3;
		System.out.println(a&b);
		//0101
		//0011
		//0001
		
		//��λ��  |
		System.out.println(a|b);
		//0101
		//0011
		//0111
		
		//��λ���
		System.out.println(a^b);
		//0101
		//0011
		//0110
		//1.������
		System.out.println(b^a);
		//2.�����
		int c=2;
		System.out.println(a^b^c);
		System.out.println(a^(b^c));
		//3.�Է���
		System.out.println(a^b^b);
		
		//�����Է��Խ�����������ֵ,����Ҫ�������������
		System.out.println(a+"\t"+b);
		a=a^b;
		//101
		//011
		//110
		b=b^a;
		//011
		//110
		//101
		a=a^b;
		//110
		//101
		//011
		System.out.println(a+"\t"+b);
	}

}
