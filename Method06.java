public class Method06{
	//main 方法
	public static void main(String[]Args) {
		B b = new B();
		int[] arr = {1,2,3};
		b.test100(arr);
		System.out.println("main中的arr数组：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
class B {
	//在B类中编写一个方法test100
	//可以接收一个数组，在方法中修改该数组，看原来的数组是否有变化
	public void test100(int [] arr) {
		arr[0] = 100;
		System.out.println("test100中的arr数组：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}