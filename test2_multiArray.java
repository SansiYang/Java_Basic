package project6;

public class test2_multiArray {

	public static void main(String[] args) {
		
		//二维数组
		//声明二维数组
		int[][]x=new int[5][5];
		int[][]y=new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
		//普通输出
		for(int i=0;i<y.length;i++) {
			for(int j=0;j<y.length;j++) {
				System.out.print(y[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println();
		//加强输出
		for(int[]arr:y) {
			for(int a:arr) {
				System.out.print(a+"\t");
			}
			System.out.println();
		}
		
	}

}
