public class Array03 {
	public static void main (String[] args) {
		/*要求：
		 * 求出一个数组的最大值，并得到对应的下标
		 * {4,-1,9,8,67,44}
		 * 
		 *思路分析：
		 * (1)定义一个int数组，int[] arr = {4,-1,9,8,67,44}
		 * (2)假定arr[0]是最大值，即max = arr[0]，maxIndex = 0
		 * (3)for循环遍历数组，并将遍历元素与max进行大小比较，if元素i>max，
		 *    那么将i的值赋给max，将i赋给maxIndex。
		 */
		int[] arr = {4,-1,4,8,67,44,999,4};
		int max = arr[0];
		int maxIndex = 0;
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("max=" + max + "\n" + "maxIndex=" + maxIndex);
	}
}