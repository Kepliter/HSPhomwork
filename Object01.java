//创建一个猫类，自定义数据类型:Cat
class Cat{
	//Cat的一些属性
	String name;
	int age;
	String color;
}

public class Object01{
	public static void main(String[]Args) {
		//通过Cat类创建一个Cat实例对象，
		//并赋给cat1（cat1是自定义的实例对象的名字）
		Cat cat1 = new Cat();
		//给具体的对象的属性赋值
		cat1.name = "小白";
		cat1.age = 2;
		cat1.color = "白色";
		
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 12;
		cat2.color = "花色";
		System.out.println("第一只猫的信息是：");
		System.out.println("name" + "\t" + "age" + "\t" + "color");
		System.out.println(cat1.name + "\t" + cat1.age + "\t" + cat1.color);
		System.out.println("第二只猫的信息是：");
		System.out.println("name" + "\t" + "age" + "\t" + "color");
		System.out.println(cat2.name + "\t" + cat2.age + "\t" + cat2.color);
	}
}