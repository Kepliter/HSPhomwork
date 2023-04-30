public class OverLoad01{
	public static void main(String[]Args) {
		Mycalculate cal = new Mycalculate();
		System.out.println(cal.calculate(1, 1));
		System.out.println(cal.calculate(1.5, 1));
		System.out.println(cal.calculate(1, 1.5));
		System.out.println(cal.calculate(1, 1, 1));
	}
}
//方法重载:在Mycalculate类中calculate构成重载
class Mycalculate{
	//两个int和
	public int calculate(int n1, int n2) {
		return n1 + n2;
	}
	//一个double与一个int的和
	public double calculate(double n1, int n2) {
		return n1 + n2;
	}
	//一个int和一个double的和
	public double calculate(int n1, double n2) {
		return n1 + n2;
	}
	//三个int的和
	public int calculate(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
}