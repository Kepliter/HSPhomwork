import java.util.Scanner;
public class Array01 {
	public static void main (String[] Args) {
		/*要求：
		 * 循环输入5个成绩，保存到double数组，并输出。
		 * 
		 */
		//double[] scores = new double[5];
		double [] scores;
		scores = new double [5];
		Scanner sca = new Scanner (System.in);
		for(int i = 0; i < scores.length; i++) {
			System.out.println ("请输入第"+ (i+1) + "个学生的成绩");
			scores[i] = sca.nextDouble();
		}
		for(int i = 0; i < scores.length; i++) {
			System.out.println ("第"+ (i+1) + "个学生的成绩=" + scores[i]);
		}
	}
}	