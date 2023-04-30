public class OverLoad02{
	public static void main(String[]Args) {
		Methods method = new Methods();
		System.out.println(method.max(1, 10));
		System.out.println(method.max(1.1, 11.1));
		System.out.println(method.max(111.1, 10.1, 10));
	}
}
//定义3个重载的方法max，第一个，返回两个int的最大值；
//第2个返回两个double中的最大值；
//第3个返回三个double中的最大值
//并在main方法中调用三个方法
class Methods{
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1, double n2, double n3) {
		double max =  n1 > n2 ? n1 : n2;
		return max > n3 ? max : n3;
	}
}