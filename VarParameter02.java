public class VarParameter02{
	public static void main(String[]Args) {
		int[] arr = {1, 2, 3};
		Demo demo = new Demo();
		demo.arrtext01(arr);
		demo.arrtext02("年年", 1, 8);
	}
}
//arrtext01解释可变参数的实参可以是一个数组
//arrtext02解释可变参数可以和普通的参数一起放在行参列表中，但是，可变参数必须放到最后
class Demo {
	public void arrtext01(int... nums) {
		System.out.println("方法arrtext01被调用：");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	public void arrtext02(String str, int... nums) {
		System.out.println("方法arrtext02被调用：");
		System.out.print(str);
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}
}