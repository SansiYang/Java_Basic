package project4;

public class test2 {

	public static void main(String[] args) {
		
		char ch='男'; //会将 char 型自动转换成 int 型 进行判断
		switch(ch) {
		case '男': System.out.println("male"); break;
		case '女': System.out.println("demale"); break;
		default: System.out.println("没有这个性别！");
		}

	}

}
