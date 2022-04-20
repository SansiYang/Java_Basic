package project5;

import java.util.Random;

public class test2 {

	public static void main(String[] args) {
		//数组的输入
		int [] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		//数组的输出1
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		//加强型输出
		for(int ele:arr) {		//从数组arr中每次取出一个元素 int 放到变量ele中
			System.out.print(ele+"\t");
		}
		System.out.println();
		//反向输出arr中的值
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		//结合随机数生成器来完成数组的赋值
		Random r=new Random();
		for(int i=0;i<arr.length;i++) {
			int x=r.nextInt(32);
			arr[i]=x;
		}
		for(int ele:arr) {
			System.out.print(ele+"\t");
		}

	}

}
