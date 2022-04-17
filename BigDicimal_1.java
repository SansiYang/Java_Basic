package project3;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDicimal_1 {

	public static void main(String[] args) {
		//BigDecimal 的简单使用
		double x=1.11;
		double y=2.22;
		double z=3.33;
		System.out.println(x+y);
		System.out.println(x*y);
		
		BigDecimal b1=new BigDecimal(0.03);
		BigDecimal b2=new BigDecimal(0.03);
		//add   subtract    multiply  divide
		
		BigDecimal b3=b1.add(b2,new MathContext(1, RoundingMode.HALF_EVEN));
		BigDecimal b4=b1.subtract(b2,new MathContext(1, RoundingMode.HALF_EVEN));
		BigDecimal b5=b1.multiply(b2,new MathContext(1, RoundingMode.HALF_EVEN));
		BigDecimal b6=b1.divide(b2,new MathContext(1, RoundingMode.HALF_EVEN));
		
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);

	}

}
