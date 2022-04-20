package project5;

import java.util.Random;

public class test10 {
	//数组初始化52个元素   0--51
	//生成随机数a：0--51  用来输出p[a] 
	//假如输出了p[4],将p[4]所存的数跟p[51]互换。
	//为了不在重复输出。生成的随机数就只能是0--51了

	public static void main(String[] args) {
		//定义数组 给数组赋值
		int[] p = new int[52];
		for (int i = 0; i <= p.length - 1; i++) {
			p[i] = i;
		}
		
		
		int b = p.length;
		for (int i = 0; i <= p.length - 1; i++) {
			Random r = new Random();
			int a = r.nextInt(b);
			System.out.println(p[a] + "\t" + hua(p[a]) + hao(p[a]));
			//将输出过的放到数组的最后
			int c = p[b-1];
			p[b-1] = p[a];
			p[a] = c;
			b = b - 1;	//不再输出数组最后的数
		}
	}

	// 判断牌的花色
	static String hua(int a) {
		String huase = " ";
		if (a >= 0 && a < 13) {
			huase = "方块";
		} else if (a >= 13 && a < 26) {
			huase = "梅花";
		} else if (a >= 26 && a < 39) {
			huase = "红桃";
		} else if (a >= 39 && a < 52) {
			huase = "黑桃";
		}
		return huase;
	}

	// 判断牌的数字
	static String hao(int a) {
		String paihao = " ";
		switch (a % 13 + 1) {
		case 1:
			paihao = "A";
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
			paihao = (a % 13 + 1) + "";
			break;
		case 11:
			paihao = "J";
			break;
		case 12:
			paihao = "Q";
			break;
		case 13:
			paihao = "K";
			break;
		default:
			System.out.println(a + "输入错误！");
		}
		return paihao;
	}

}
