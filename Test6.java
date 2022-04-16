package project2;

import java.util.Random;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
				int min='\u4E00';  // 19968
				int max='\u9fa5';  // 40869
				
				Random r=new Random();
				int word=min+ r.nextInt(max  -  min);
				System.out.println("原字符为："+(char)word+"\t"+word);
				
				System.out.println("请输入密钥：");
				Scanner sc=new Scanner(System.in);
				int key=sc.nextInt();
				
				char newch= (char)(word+key);
				System.out.println("加密后的字符为："+newch);

			

	}

}
