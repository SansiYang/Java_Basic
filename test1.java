package project6;

import utils.YcUtil;

public class test1 {

	public static void main(String[] args) {

		// 冒泡排序
		// 创建数组
		int[] x = new int[5];
		// 随机赋值
		YcUtil.genArray(x, 10);
		// 打印数组
		YcUtil.print(x);
		// 冒泡排序算法
		for (int i = 0; i < x.length - 1; i++) { // 外循环 循环 元素个数-1 轮
			for (int j = 1; j < x.length - i; j++) { // 内循环 每次循环后减少一个
				if (x[j - 1] > x[j]) {
					int temp = x[j];
					x[j] = x[j - 1];
					x[j - 1] = temp;
				}
			}
		}
		System.out.println("排好序的数组：");
		YcUtil.print(x);

	}

}
