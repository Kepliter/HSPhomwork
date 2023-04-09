public class YangHui{
	public static void main(String[]Args) {
		/*
		 输出10行的杨辉三角
		 1
		 1 1 
		 1 2  1
		 1 3  3  1
		 1 4  6  4  1
		 1 5  10 10 5 1
		 ......................
		 规律：
		 1，第n行有n个元素
		 2，每行第一个元素和最后一个元素均为1
		 3，中间元素：arr[i][j] = arr[i-1][j] + arr[i-1][j-1]
		 */
		//定义二维数组arr，包括10个数组，每个数组中的元素个数未知
		int[][] arr = new int[10][];
		//遍历二维数组arr中的每个元素，即每个数组
		for(int i = 0; i < arr.length; i++) {
			//给二维数组中的每个数组开辟空间
			arr[i] = new int[i+1];
			//遍历二维数组中每个数组中的元素
			for(int j = 0; j < arr[i].length; j++) {
				//若元素是第一个或者做后一个，则元素的值是1
				if(j == 0 | j == arr[i].length - 1) {
					arr[i][j] = 1;
					//否则，元素的值（即中间元素的值）是上一列对应的值
					//与上一列对应值的前一个值的和
				}else {
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}