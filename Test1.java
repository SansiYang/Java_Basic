package project2;

public class Test1 {

	public static void main(String[] args) {
		//String  ��һ���࣬���� S Ҫ��д��
		// ���Դ����ַ�
		//�����ַ���
		String s1="";  //�մ�
		String s2="hello";
		String s3="ni hao";
		String s4="��Һã�";
		
		//�ϲ���һ�����   �ַ���  +  �ַ���
		System.out.println(s1+s2+s3+s4);
		//  "\t"��ת���ַ�  ���ڰ˸��ո�  ���ǰ���Ҫ������ַ� һ��ռ�˸�
		System.out.println(s1+"\t"+s2+"\t"+s3+"\t"+s4);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		//���ַ�������
		System.out.println(   s1.length()   );
		System.out.println(  s4.length()  );

		
	}

}