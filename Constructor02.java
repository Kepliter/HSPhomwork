public class Constructor02{
	public static void main(String[]Args) {
		//使用无参构造器创建对象
		PersonDemo p1 = new PersonDemo();
		System.out.println("p1的信息如下：" + "\n" + "name=" + p1.name +" " + "age=" + p1.age);
		//使用带pName和pAge两个参数的构造器创建对象
		PersonDemo p2 = new PersonDemo("kinn", 20);
		System.out.println("p2的信息如下：" + "\n" + "name=" + p2.name +" " + "age=" + p2.age);
		
	}
}
/* 在PersonDemo类中添加两个构造器
 * 1）第一个无参构造器，利用构造器设置所有人的age属性初始值都为18
 * 2）第二个构造器，带pName和pAge两个参数，使每次创建PersonDemo对象的同时，初始化age和name属性值
 * 分别使用不同的构造器创建对象
 */
class PersonDemo{
	String name;
	int age;
	//无参构造器
	public PersonDemo(){
		age = 18;
	}
	//带pName和pAge两个参数的构造器
	public PersonDemo(String pName, int pAge) {
		name = pName;
		age = pAge;
		
	}
}