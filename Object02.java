public class Object02{
	public static void main(String[]Args) {
		//通过Person类,创建实例对象，命名为people，
		//不对people对象的属性（成员变量）进行赋值，为默认值
		Person people = new Person();
		System.out.println("name=" + people.name);
		System.out.println("age=" + people.age);
		System.out.println("gender=" + people.gender);
		System.out.println("sal=" + people.sal);
		System.out.println("adult=" + people.adult);
	}
}

class Person{
	String name;
	int age;
	String gender;
	double sal;
	boolean adult;
	
}