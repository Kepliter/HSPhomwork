public class Method08{
	public static void main(String[]Args) {
		//创建一个Person00类的对象，名为p1
		Person00 p1 = new Person00();
		p1.name = "TOM";
		p1.age = 100;
		////创建一个Copy类的对象，名为copy
		Copy copy = new Copy();
		//调用copyPerson方法，将p1对象复制到p2对象
		Person00 p2 = copy.copyPerson(p1);
		//到这里，p1,p2是两个属性相同的不同对象。
		System.out.println("p1的属性：" + "\n" + "name: " + p1.name + " " + "age: " + p1.age);
		System.out.println("p2的属性：" + "\n" + "name: " + p2.name + " " + "age: " + p2.age);
	}
}
//编写一个copyPerson的方法，可以复制一个Person对象，返回复制的对象，即克隆对象。
//要求得到的新对象和原来的对象是两个独立的对象，只是它们的属性相同。
class Person00{
	String name;
	int age;
}
//编写一个copyPerson的方法，可以复制一个Person对象，返回复制的对象，即克隆对象。
//要求得到的新对象和原来的对象是两个独立的对象，只是它们的属性相同。
class Copy {
	/*方法定义：
	 * 访问修饰符 返回值类型 方法名（行参列表）{
	 * 		方法体；
	 * 		return 返回值；
	 * }
	 */
	//定义copyPerson方法，行参为Person00类型的p1对象
	public Person00 copyPerson(Person00 p1) {
		Person00 p2 = new Person00();//创建一个Person00类的对象，名为p2
		p2.name = p1.name;//将p1对象的name属性值赋值给p2对象的name属性
		p2.age = p1.age;//将p1对象的age属性值赋值给p2对象的age属性
		return p2;//将p2对象返回
	}
}