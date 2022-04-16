package project2;

import java.util.Random;
import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// tencent
		//牌类游戏
		//4个花色   13张/1一花色
		Random r=new Random();
		int a=r.nextInt(52);
		String hua="";
		switch(a/13) {
		case 0: hua="方块"; break;
		case 1: hua="梅花"; break;
		case 2: hua="红桃"; break;
		case 3: hua="黑桃"; break;
		}
		
		
		int b=a%13+1;
		String shu="";
		switch(b) {
		case 1:  shu="A"; break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10: shu=b+""; break;
		case 11: shu="J"; break;
		case 12: shu="Q"; break;
		case 13: shu="K"; break;
		
		}
		System.out.println( a );
		System.out.println(hua + shu);
		
		
		
		Scanner sc=new Scanner(System.in);
		
	}

}
