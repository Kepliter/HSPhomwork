public class RecursionInput{
	public static void main(String[]Args) {
		int n = 5;
		Recursion01 R = new Recursion01();
		R.recursionInput(n);
	}
}
class Recursion01{
	public void recursionInput(int n) {
		if(n > 2) {
			//递归（在方法中调用自己，此时不需要new对象），每次调用都会产生一个新栈。
			//当执行到n > 2不成历史，即n = 2时，开始输出，并逐步返回到调用语句，输出。
			recursionInput(n - 1);
		}
		System.out.println("n = " + n);
	}
}