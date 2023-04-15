public class Method01 {
	public static void main(String[]Args) {
		//方法的调用：
		//先创建对象，然后调用方法
		//方法在类中写好后，不调用，不会输出。
		Person01 P1 = new Person01();
		P1.speak();
		P1.cal01();
		//调用cal02方法时，需要提供实参为行参列表中的参数赋值。
		//10是对cal02成员方法中的行参列表中的参数 n 进行赋值，即提供实参。 
		P1.cal02(5);
		//同一方法可以被反复调用。
		P1.cal02(1000);
		//调用成员方法getSum，并给行参列表中的num1，num2提供实参。
		//定义int类型变量returnRes接收getSum方法返回值。
		int returnRes = P1.getSum(1,1);
		System.out.println("getSum方法计算结果： " + returnRes);
		
	}
}
//创建一个Person01类
class Person01 {
	//定义成员变量，即属性
	String name;
	int ages;
	double sal;
	boolean adult;
	//添加成员方法，即方法
	//public 表示方法是公开的，即可被访问调用
	//void 表示方法没有返回值
	//speak() speak是自定义的方法名；()是行参列表
	/* 行参列表指的是Java方法声明中的参数列表部分，包含在圆括号内，
	   用逗号分隔各个参数。行参列表中可以包含零个或多个参数，
	   每个参数都由类型和名称组成，类型用于指定参数的数据类型，
	   名称用于在方法体中引用该参数。
	   下面的方法声明中的行参列表包含两个参数，分别是整数类型的a和b：
	 * 
       public int add(int a, int b) {
    		return a + b;
		}
	   在调用该方法时，需要提供实参来为行参列表中的参数赋值。
	   例如，以下代码调用了上述的add方法并传入了两个实参：

	   int result = add(3, 5);
       其中，实参3和5分别传递给了方法的行参列表中的参数a和b，
       方法执行后返回值为8，被赋值给了变量result。
	 */
	//{} 内是我们写的方法体，即写我们要执行的代码。
	public void speak(){
		System.out.println("日本語で話すことができます");
	}
	//添加cal01成员方法，计算1+...+1000的结果。
	public void cal01() {
		int res = 0;
		for(int i = 0; i <= 1000; i++) {
			res += i;
		}
		System.out.println("cal01方法计算结果： " + res);
	}
	//添加cal02成员方法，计算1+...+n的结果
	//(int n) 表示行参列表，
	//int n 表示当前有一个形式参数 n ，可以接受用户（调用者）输入
	public void cal02(int n){
		int res = 0;
		for(int i = 1; i <= n; i++) {
			res += i;
		}
		System.out.println("cal02方法计算结果： " + res);
	}
	//添加getSum成员方法，计算两个数的和
	//int 表示有返回值，即方法执行后，返回int类型值。
	//(int num1, int num2)表示行参列表，有两个行参，可以接收调用者输入的两个实参。
	public int getSum(int num1, int num2) {
		int res = num1 + num2;
		//表示把res的值返回，在调用该方法时，可以定义一个变量接收该返回值
		return res;
		//System.out.println("getSum方法计算结果： " + res);
	}
}
