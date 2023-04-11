public class ArrayLearn01{
	public static void main(String[]Args) {
		/*
		 * 1-100内随机生成10个整数，倒序打印，求平均值，
		 * 求最大值和最大值下标，并查找其中是否包含数字66
		 */
		int[] arr = new int[10];//创建长度为10 的整数类型数组
		for(int i = 0; i < arr.length; i++) {
			//随机生成1-100内的整数
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println("随机生成整数为： ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\n" + "倒序后为： ");
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + "\t");
		}
		
		int max = arr[0];
		int maxIndex = 0;
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(arr[i] > max) {
				max = arr[i];
				maxIndex = i;	
			}
		}
		System.out.println("\n" + "平均值= " + (sum/arr.length));
		System.out.println("最大值= " + max);
		System.out.println("最大值下标为： " + maxIndex);
		//顺序查找
		int findNum = 8;
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == findNum) {
				System.out.println("随机生成的整数中含有" + findNum);
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("随机生成的整数中不包含" + findNum);
		}
	}
}