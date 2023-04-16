public class Method02 {
	public static void main(String[] Agrs) {
		int[][]arr = {{0,0,1},{1,1,1},{2,3,3}};
		//通过MyTools类创建对象，并赋给tool。
		MyTools tool= new MyTools();
		//调用arrPrint方法，并给行参int[][] arr赋值，即实参化。
		tool.arrPrint(arr);
		tool.arrPrint(arr);
		tool.arrPrint(arr);
	}
}
//定义名称为MyTools的类
class MyTools{
	//添加公开的，无返回值的，名称为arrPrint的方法
	//该方法的行参为二维数组int[][] arr
	public void arrPrint(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------");
	}
}