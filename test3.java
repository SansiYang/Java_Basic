package project4;

public class test3 {

	public static void main(String[] args) {
		//µ•÷ÿ—≠ª∑
		int sum=0;
		int i=1;
		
		while(i<=100) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
		
		for(i=1;i<=100;i++) {
			sum=i+sum;
		}
		System.out.println(sum);
		
		int i1=1;
		int sum1=0;
		do {
			sum1=sum1+i1;
			i++;
		}while(i1<=100);
		System.out.println(sum1);
		
		
	}

}
