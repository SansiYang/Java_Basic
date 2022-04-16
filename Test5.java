package project2;

import java.util.Random;

public class Test5 {

	public static void main(String[] args) {
		//随机数的对象学习
		Random r=new Random();//随机数生成器
		
		int x=r.nextInt(  11  ); //生成 0——10 的随机数
		System.out.println(  x  );
		
		//需求：生成 30——50 的随机数
		
		int y=30+r.nextInt(21);
		System.out.println(  y  );
		
		

	}

}
