//要求：
//1.列出1-100之间能被9整除的整数
//2.并统计个数
//3.并将这些数求和
public class ForLearn01 {
	public static void main (String[] args) {
		int start = 12;
		int end = 100;
		int count = 0;
		int sum = 0;
		int bei = 11;
		for (int i =start ; i <= end ; i++) {
			if (i % bei == 0) {
				System.out.println (i);
				count++;
				sum += i;
			}
		}
		System.out.println ("------------------------------");
		System.out.println (count ++);
		System.out.println (sum);
	}
}