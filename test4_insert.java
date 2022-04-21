package project6;

import utils.YcUtil;

public class test4_insert {

	public static void main(String[] args) {
		// 插入排序
		// 创建数组
		int[] x = new int[5];
		// 随机赋值
		YcUtil.genArray(x, 10);
		// 打印数组
		YcUtil.print(x);
		
		// 插入排序算法
		for(int i=1;i<x.length;i++) {
			//取出当前未排序的值
			int next=x[i];
			//记录当前待排序的元素在数组中的位置
			int j=i;
			//开始向前循环
			while(j>0) {
				if(x[j-1]<next) {
					break;
				}
				x[j]=x[j-1];
				j--;
			}
			//找到了要插入的位置
			x[j]=next;
		}
		YcUtil.print(x);

	}

}
