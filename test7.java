package project5;

public class test7 {

	public static void main(String[] args) {
		//在一个数组中找到最大值和最小值
		int [] x=new int[10];
		
		//静态调用  类名.方法（参数）;
		test6.genArray(x,10);
		test6.print(x);
		
		//查找最值
		int max=x[0],min=x[0];
		for(int i=1;i<x.length;i++) {
			if(max<x[i]) {
				int temp=x[i];
				
			}
		}
	}

}
