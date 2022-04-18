package project4;

import java.util.Random;

public class test6 {

	public static void main(String[] args) {
		
		
		
		Random r=new Random();
		
		int cha=0x9FA5-0x4E00;
		int i=0;
		for(i=1;i<=100;i++) {
			int name1=r.nextInt(  cha  )+0x4E00;
			int name2=r.nextInt(cha)+0x4E00;
			String name=(char)name1+" "+(char)name2;
			int age=r.nextInt(61)+20;
			char sex=r.nextInt(2)==0?'男':'女';
			System.out.println("姓名为："+name+"\t"+"年龄为："+age+"\t"+"性别为："+sex	);
		}
		
		
	}

}
