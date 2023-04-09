public class TwoDimensionalArray05{
	public static void main(String[] Args) {
		/*
		 int[][] arr = {{2,8},{4,6,10},{-22}}
		 遍历二维数组，求元素之和
		 */
		int[][] arr = {{2,8},{4,6,10},{-22}};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("二维数组元素之和 = " + sum);
	}
}