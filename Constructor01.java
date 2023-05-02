public class Constructor01{
	public static void main(String[]Args) {
		PersonText P = new PersonText("kinn", 18);
		System.out.println("P的name=" + P.name + "\n" + "P的age=" + P.age);
	}
}
//构造器（构造方法）示例
//构造器是一种特殊的方法，用于创建对象时初始化对象。
class PersonText{
	String name;
	int age;
	//构造器
	/* 1)构造器的修饰符可以默认
	 * 2）构造器无返回值，不能写void
	 * 3）方法名和类名必须完全一致
	 * 4）参数列表和成员方法的规则一致
	 * 5）构造器的调用石油系统完成的。
	 * 
	 */
	public PersonText(String pName, int pAge) {
		System.out.println("构造器被调用,完成对象的属性的初始化");
		name = pName;
		age = pAge;
		
	}
}