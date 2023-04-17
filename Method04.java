public class Method04{
	public static void main(String[]Args) {
	//根据行，列。字符要求打印对应的图形
	//比如：行：4，列：4，字符：$
		Tool pic =new Tool();
		pic.printChar(5, 5, '$');
		
	}
}
class Tool{
	/*方法定义：
	 * 访问修饰符 返回值类型 方法名（行参列表）{
	 * 		方法体；
	 * 		return 返回值；
	 * }
	 */
	public void printChar(int row, int col, char a) {
		for(int i = 0; i < row; i++) {
			for(int k = 0; k < col; k++) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}
}