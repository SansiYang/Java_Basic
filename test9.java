package project4;

public class test9 {

	public static void main(String[] args) {
		//   break  : ѭ��ȫ����ϣ�ִ��ѭ������Ĵ���
		//   continue  :  ��ϵ�ǰѭ����ִ����һ��ѭ��
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
