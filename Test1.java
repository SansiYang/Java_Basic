package project2;

public class Test1 {

	public static void main(String[] args) {
		//String  是一个类，所以 S 要大写。
		// 可以存多个字符
		//创建字符串
		String s1="";  //空串
		String s2="hello";
		String s3="ni hao";
		String s4="大家好！";
		
		//合并到一行输出   字符串  +  字符串
		System.out.println(s1+s2+s3+s4);
		//  "\t"是转义字符  等于八个空格  但是包括要输出的字符 一共占八个
		System.out.println(s1+"\t"+s2+"\t"+s3+"\t"+s4);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		//求字符串长度
		System.out.println(   s1.length()   );
		System.out.println(  s4.length()  );

		
	}

}