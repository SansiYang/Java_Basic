package project5;

import java.util.Random;
import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		// tencent
		// ������Ϸ
		// 4����ɫ 13��/1һ��ɫ
		int[] x = new int[52];
		for (int i = 0; i <=51; i++) {
			x[i] = i;
		}
		
		Random r=new Random();
		int b=x.length;
		for(int i= 0;i<x.length;i++) {
		int a=r.nextInt(b);
		int temp=x[a];
		x[a]=x[x.length-1];
		x[x.length-1]=temp;
		b--;
		

		String hua = "";
		switch (x[a] / 13) {
		case 0:
			hua = "����";
			break;
		case 1:
			hua = "÷��";
			break;
		case 2:
			hua = "����";
			break;
		case 3:
			hua = "����";
			break;
		}

		int bc = x[a] % 13 + 1;
		String shu = "";
		switch (bc) {
		case 1:
			shu = "A";
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			shu = bc + "";
			break;
		case 11:
			shu = "J";
			break;
		case 12:
			shu = "Q";
			break;
		case 13:
			shu = "K";
			break;

		}
		System.out.println(x[a]);
		System.out.println(hua + shu);

		Scanner sc = new Scanner(System.in);
		}
	}

}
