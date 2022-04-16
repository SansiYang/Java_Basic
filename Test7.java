package project2;

import java.util.Random;
import java.util.Scanner;

public class Test7 {
//java的最小运行单位是类
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(  a  );
		
		Random r=new Random();
		int b=r.nextInt(11);
		System.out.println(  b  );

	}

}
