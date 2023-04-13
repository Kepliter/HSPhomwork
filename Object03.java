public class Object03{
	public static void main(String[]Args) {
		//new一个实例对象，命名peaple1
		Peaple peaple1 = new Peaple();
		//给对象属性赋值
		peaple1.name = "小明";
		peaple1.age = 10;
		//把对象peaple1的空间赋给peaple2，
		//或者说让peaple2指向peaple1的空间
		Peaple peaple2 = peaple1;
		System.out.println(peaple2.age);
		
	}
}
//创建Peaple类
class Peaple{
	//成员变量（属性）
	String name;
	int age;
}