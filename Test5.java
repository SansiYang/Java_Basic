package project2;

import java.util.Random;

public class Test5 {

	public static void main(String[] args) {
		//������Ķ���ѧϰ
		Random r=new Random();//�����������
		
		int x=r.nextInt(  11  ); //���� 0����10 �������
		System.out.println(  x  );
		
		//�������� 30����50 �������
		
		int y=30+r.nextInt(21);
		System.out.println(  y  );
		
		

	}

}
