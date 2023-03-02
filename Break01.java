public class Break01 {
	public static void main (String[] args) {
		/*要求：1-100的数求和，当和大于20时，记录当前数（for break）
		 * 思路分析：
		 * 1.循环1-100的整数，求和 赋值给sum
		 * 2.当第一次sum > 20;记录当前数，break
		 */
		int sum = 0;
		int n = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (sum > 20) {
				//System.out.println ("和大于20时，i=" + i);
				n = i;
				break;
			}
		}
		System.out.println ("和大于20时，i=" + n);
	}
}