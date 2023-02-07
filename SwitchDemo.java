import java.util.Scanner;
public class SwitchDemo {
	public static void main (String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println ("请输入您的Java成绩");
		double score = sca.nextDouble();
		if (score >= 0 && score <= 100) {
			switch ((int) (score / 60)) {
			case 0 :
				System.out.println ("成绩不合格，请准备补考");
				break;
			case 1 :
				System.out.println ("成绩合格");
				break;
			}
		}else {
			System.out.println ("成绩输入有误，请重新输入");
		}
	}
}