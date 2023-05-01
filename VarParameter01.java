public class VarParameter01{
	public static void main(String[]Args) {
		SumMethod add = new SumMethod();
		System.out.println(add.sum(100, 50, 51));
		System.out.println(add.sum(100, 50, 51, 1000));
	}
}
/*创建方法sum，实现多个整数的和
 * 首先，可以使用方法的重载，但是需要按照整数的个数分别定义方法，比较繁琐，
 * java中允许将同一类中多个同名，同功能，但是参数个数不同的方法封装成一个方法，这就是可变参数。
 * 
 * 可变参数的语法为：
 * 访问修饰符 返回类型 方法名(数据类型... 行参名){
 * 		方法体
 * }
 * 说明：1）可变参数的实参可以是0个，也可以是多个；
 * 		2）可变参数的实参可以是一个数组；
 * 		3）可变参数的行参本质就是数组；
 * 		4）可变参数可以和普通的参数一起放在行参列表中，但是，可变参数必须放到最后；
 * 		5）一个行参列表中只能有一个可变参数。
 */
class SumMethod {
	public int sum(int... nums) {
		System.out.println("传入的参数个数为" + nums.length);
			int res = 0;
			for(int i = 0; i < nums.length; i++) {
				res += nums[i];
			}
			return res;
	}
}