package project4;

public class test9 {

	public static void main(String[] args) {
		//   break  : 循环全部打断，执行循环后面的代码
		//   continue  :  打断当前循环，执行下一次循环
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum+=i;
				continue;
			}
		}
		System.out.println(sum);
	}

}
