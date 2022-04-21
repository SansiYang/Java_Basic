package project6;

import utils.YcUtil;

public class test2 {

	public static void main(String[] args) {
		// 选择排序
		// 创建数组
		int[] x = new int[5];
		// 随机赋值
		YcUtil.genArray(x, 10);
		// 打印数组
		YcUtil.print(x);
		// 选择排序算法
		System.out.println("最大数的索引为："+findMaxIndex(x,1));
		
		for(int i=0;i<x.length-1;i++) {
			int maxIndex=findMaxIndex(x,i);
			if(x[maxIndex]!=i) {
				int temp=x[maxIndex];
				x[maxIndex]=x[i];
				x[i]=temp;
			}
		}
		System.out.println("选择排序的结果为：");
		YcUtil.print(x);

	}
	
	static int findMaxIndex(int []x,int from) {
		int maxIndex=from;
		for(int i=from+1;i<x.length;i++) {
			if(x[i]>x[maxIndex]) {
				maxIndex=i;
			}
		}
		return maxIndex;
	}
	

}
