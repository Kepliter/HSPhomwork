public class TwoDimensionalArray03{
	public static void main(String[]Args) {
		//二维数组使用方法二：动态初始化
		int [][] arr;
		arr = new int [2][3];
		arr[1][1] = 9;
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}