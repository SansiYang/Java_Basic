package project6;

public class test3_bank {

	public static void main(String[] args) {
		int n = 5;
		// 借贷数
		double[][] load = new double[][] { { 0, 100.5, 0, 0, 320.5 }, { 0, 0, 40, 85, 0 }, { 125, 0, 0, 75, 0 },
				{ 125, 0, 0, 0, 0 }, { 0, 0, 125, 0, 0 } };
		// 余额
		double[] balances = new double[] { 25, 125, 175, 75, 181 };
		// 总资产
		double[] assets = new double[n];
		// 判断是否安全
		boolean[] isSafe = new boolean[n];
		// 初始化安全判断
		for (int i = 0; i < isSafe.length; i++) {
			isSafe[i] = true;
		}
		// 安全线
		double limit = 201;

		boolean hasNewUnsafe = false;

		do {
			hasNewUnsafe = false;
			for (int i = 0; i < n; i++) {
				assets[i] = balances[i];
				for (int j = 0; j < n; j++) {
					assets[i] += load[i][j];
				}
				if (isSafe[i] && assets[i] < limit) {
					hasNewUnsafe = true; // 真的找到了新的不安全的银行
					isSafe[i] = false;
					System.out.println(i + "号银行是不安全的！它的资产是：" + assets[i]);
					// 清空load中下标为 i 这一列所有的值为0
					// 将第i列的值变为0
					for (int k = 0; k < n; k++) {
						load[k][i] = 0;
					}
				}
			}

		} while (hasNewUnsafe);
		// 寻找一家不安全的银行

	}

}


/*
 * 先找到一家不安全的银行
 * 再将和这家银行有关系的其他银行的资产改了
 * 再次判断其他银行的资产情况
 * 若是还有不安全的银行
 * 再改和这家银行相关的银行的资产 
 *  */
