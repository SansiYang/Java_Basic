package project3;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		//��Ԫ����
		// x?y:z;
		boolean x=false;
		int y=1,z=2;
		System.out.println(x?y:z);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("������һ����:");
		int num=sc.nextInt();
		
		System.out.println(  num%2==0?  "ż��":"����");
		String str=(num%2==0? "ż��":"����");
		System.out.println(num+"��"+str);
	}

}
