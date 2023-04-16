public class Method03 {
	public static void main(String[] Args) {
		//编写一个类，里面有方法，判断一个数是奇数还是偶数，返回boolean
		Tools Num =new Tools();
		//boolean n = Num.isOdd(100);
		if(Num.isOdd(1)) {
			System.out.println("是奇数");
		}else {
			System.out.println("是偶数");
		}
		
	}
}
class Tools{
	/*方法定义：
	 * 访问修饰符 返回值类型 方法名（行参列表）{
	 * 		方法体；
	 * 		return 返回值；
	 * }
	 */
	public boolean isOdd(int num) {
		/*if(num % 2 != 0) {
			return true;
		}else {
			return false;
		}
		*/
		return num % 2 != 0;
	}
}