public class RecursionFibNum{ //主类
	public static void main(String[]Args) { //主方法
		int n = 9; //定义需要计算的斐波那契数列中的数的位置
		Fib Fnum = new Fib(); //实例化Fib类的对象
		int res = Fnum.fibNum(n); //调用Fib类中的方法计算斐波那契数列中第n个数的值
		System.out.println("n = " + n + ",\n斐波那契数的值是：" + res); //输出结果
	}
}

class Fib { //斐波那契数列计算类
	public int fibNum(int n) { //递归方法，返回斐波那契数列中第n个数的值
		if(n > 0) { //判断n的值是否大于0
			if(n < 3) { //当n=1或2时，返回1
				return 1;
			}else { //当n>2时，递归计算斐波那契数列中第n个数的值
				return fibNum(n - 1) + fibNum(n - 2);
			}
		}else { //当n的值小于等于0时，输出提示信息并返回0
			System.out.println("n 的值必须为大于0的整数");
			return 0;//注意，必须需要有return
		}
	}
}
