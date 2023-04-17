//parameter传参机制示例
//结论：对于基本数据类型，传递的是值，即值拷贝，行参的任何改变不会影响实参。
public class Method05{
	public static void main(String[]Args) {
		int a = 1;
		int b = 2;
		//创建对象
		Tools01 obj01 = new Tools01();
		//调用方法
		obj01.swap(a, b);
		System.out.println("main方法中的值a = " + a + "\t" + "b = " + b);
	}
}
//创建类
class Tools01{
	public void swap(int a, int b) {
		System.out.println("交换前的值a = " + a + "\t" + "b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("交换后的值a = " + a + "\t" + "b = " + b);
		
	}
}