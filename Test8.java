package project3;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.math.MathContext;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Test8 {

	public static void main(String[] args) {
		//BMI:����/���*���
		//��������  ����  ���  
		Scanner sc=new Scanner(System.in);
		System.out.println("������������");
		String name=sc.nextLine();
		System.out.println("��������ߣ�");
		double high=sc.nextDouble();
		System.out.println("���������أ�");
		int weight=sc.nextInt();
		
		BigDecimal a=new BigDecimal(weight);
		BigDecimal bd=new BigDecimal(high);
		
		bd=bd.multiply(bd,MathContext.DECIMAL32);
		
		double  BMI= a.divide(  bd  ,  new MathContext(4, RoundingMode.HALF_EVEN) ).doubleValue();
		
		//double BMI=weight/high*high;
		if(BMI<18.5) {
			System.out.println(name+","+"����BMIΪ��"+BMI+","+"�������ع��͡�");
		}
		if(BMI>=18.5&&BMI<24) {
			System.out.println(name+","+"����BMIΪ��"+BMI+","+"��������������");
		}
		if(BMI>=24&&BMI<=28) {
			System.out.println(name+","+"����BMIΪ��"+BMI+","+"���ĳ����ˡ�");
		}
		if(BMI>28) {
			System.out.println(name+","+"����BMIΪ��"+BMI+","+"�����ڷ�����ġ�");
		}

	}

}
