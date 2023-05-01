public class VarParameter03{
	public static void main(String[]Args) {
		School sch =new School();
		System.out.println(sch.nameScore("kinn", 100,99,98,91));
	}
}
/* 有三个方法，分别实现返回姓名和两门课成绩总分；
 * 返回姓名和三门课成绩总分；返回五门课和成绩总分
 * 封装成一个可变参数方法
 */
class School{
	public String nameScore(String name, double... scores) {
		double totalScore = 0;
		for(int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return name + "的" + scores.length + "门课程的总成绩为：" + totalScore;
	}
}