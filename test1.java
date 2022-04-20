package project5;

public class test1 {

	public static void main(String[] args) {
		//数组声明   数据类型 [] 数组名
		//  数组名=new 数据类型[长度]
		
		int [] x=new int[10];		//可以存10个int数的数组
		System.out.println(x);
		
		System.out.println(x[0]);
		System.out.println(x[2]);
		//java会对数组初始化
		
		double [] y=new double[10];
		boolean [] z=new boolean[10];
		String [] a=new String[10];
		
		//其他声明1
		int [] ages= {20,10,65};
		
		//其他声明2（不常用）
		int [] t=new int[] {20,30,51};

	}

}
