import java.util.Scanner;
public class IfElseNested01 {
	public static void main (String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println ("请输入乘车月份");
		int month = sca.nextInt();
		int price = 60;
		if (month >= 1 && month <= 12) {
			if (month >= 4 && month <= 10) {
				System.out.println ("请输入您的年龄");
				int age = sca.nextInt();
				if (age < 18 && age > 0) {
					System.out.println ("您的单人票价为" + price / 2);
				}else if (age >= 18 && age <= 60) {
					System.out.println ("您的单人票价为" + price);
				}else if (age > 60 && age < 150) {
					System.out.println ("您的单人票价为" + price / 3);
				}else {
					System.out.println ("请您重新核对年龄");
				}
			} else {
				System.out.println ("请输入您的年龄");
				int age = sca.nextInt();
				if (age >= 18 && age <= 60) {
					System.out.println ("您的单人票价为40元");
				} else {
				System.out.println ("您的单人票价为20元");
				}
			}
		}else {
			System.out.println ("请输入正确的月份");
		}
	}
}