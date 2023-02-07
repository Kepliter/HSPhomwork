import java.util.Scanner;
public class IfElseNested {
	public static void main (String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println ("请输入您的预赛成绩");
		double score = sca.nextDouble();
		if(score > 8.0) {
			System.out.println ("恭喜您进入决赛");
			System.out.println ("请输入您的性别");
			//String gender = sca.next();
			char gender = sca.next().charAt(0);
			if(gender == '男') {
				System.out.println ("进入男子组决赛");
			}else if (gender == '女') {
				System.out.println ("进入女子组决赛");
			}else {
				System.out.println ("性别输入有误");
			}
		}else {
			System.out.println ("很遗憾，您已被淘汰");
		}
	}
}