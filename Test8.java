package project3;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.math.MathContext;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Test8 {

	public static void main(String[] args) {
		//BMI:体重/身高*身高
		//输入人名  体重  身高  
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入姓名：");
		String name=sc.nextLine();
		System.out.println("请输入身高：");
		double high=sc.nextDouble();
		System.out.println("请输入体重：");
		int weight=sc.nextInt();
		
		BigDecimal a=new BigDecimal(weight);
		BigDecimal bd=new BigDecimal(high);
		
		bd=bd.multiply(bd,MathContext.DECIMAL32);
		
		double  BMI= a.divide(  bd  ,  new MathContext(4, RoundingMode.HALF_EVEN) ).doubleValue();
		
		//double BMI=weight/high*high;
		if(BMI<18.5) {
			System.out.println(name+","+"您的BMI为："+BMI+","+"您的体重过低。");
		}
		if(BMI>=18.5&&BMI<24) {
			System.out.println(name+","+"您的BMI为："+BMI+","+"您的体重正常。");
		}
		if(BMI>=24&&BMI<=28) {
			System.out.println(name+","+"您的BMI为："+BMI+","+"您的超重了。");
		}
		if(BMI>28) {
			System.out.println(name+","+"您的BMI为："+BMI+","+"您属于肥胖身材。");
		}

	}

}
