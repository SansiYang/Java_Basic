package project5;

import java.util.Random;

public class test8 {

	public static void main(String[] args) {
		// 给一个数组
		int [] x=new int[] {1,5,7,9};
		
		//随机在数组x中抽取元素，要求每次抽的不一样。抽取次数和数组长一样。
		Random r=new Random();
		int b=x.length;
		
		for(int i= 0;i<x.length;i++) {
		int a=r.nextInt(b);
		System.out.println(x[a]);
		int temp=x[a];
		x[a]=x[x.length-1];
		x[x.length-1]=temp;
		b--;
		}
	}

}
