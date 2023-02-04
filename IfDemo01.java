import java.util.Scanner;
public class IfDemo01{
	public static void main(String[] args) {
		Scanner sca = new Scanner (System.in);
		System.out.println ("请输入您的年龄");
		int age = sca.nextInt();
		if(age < 12) {
			System.out.println ("未满12，禁止访问");
		}else {
			System.out.println("欢迎来到Java世界！");
		}
	}
}