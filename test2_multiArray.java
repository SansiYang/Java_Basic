package project6;

public class test2_multiArray {

	public static void main(String[] args) {
		
		//��ά����
		//������ά����
		int[][]x=new int[5][5];
		int[][]y=new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
		//��ͨ���
		for(int i=0;i<y.length;i++) {
			for(int j=0;j<y.length;j++) {
				System.out.print(y[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println();
		//��ǿ���
		for(int[]arr:y) {
			for(int a:arr) {
				System.out.print(a+"\t");
			}
			System.out.println();
		}
		
	}

}
