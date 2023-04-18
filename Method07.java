public class Method07{
	public static void main(String[]Args) {
		Mytool mytools = new Mytool();
		int[][] arr1 = {{1,1,1},{8,8,9},{1,0,0}}; 
		int[][] arr2 = new int[4][4]; 
		mytools.printArr(arr1);
		mytools.printArr(arr2);
	}
}
//编写Mytool类，编写方法，可以打印二维数组。
class Mytool{
	public void printArr(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}