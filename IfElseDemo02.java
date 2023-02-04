import java.util.Scanner;
public class IfElseDemo02 {
	public static void main (String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println ("请输入您的芝麻信用分数");
		int grade = sca.nextInt();
		if(grade>=1 && grade <= 100) {
			
			if(grade == 100) {
				System.out.println ("您的可贷款额度为：\n10000000");
			}else if(grade > 80 && grade <= 99) {
				System.out.println ("您的贷款额度为：\n8000000");
			}else if(grade >= 60 && grade <= 80) {
				System.out.println ("您的贷款额度为：\n5000000");
			}else if(grade < 60 && grade >= 1) {
				System.out.println ("您的贷款额度为：\n0");	
		}
		}else {
			System.out.println ("请输入正确的芝麻信用分\n提示：0-100");
		}
	}	
}	