/*
			每层✳个数						空格数
    *			1	2*i-1				4		5-i
   ***			3						3
  *****			5						2
 *******		7						1
*********		9						0
*/

public class Starts {
	public static void main (String[] args) {
		int totalNum = 10;
		//i 控制层数
		for (int i = 1; i <= totalNum; i++) {
			//k 控制每行输出空格数
			for (int k = 1; k <= totalNum - i; k++) {
				System.out.print(" ");
			}
			//j 控制每行 * 个数
			for (int j = 1; j <= 2 * i - 1; j++) {
				//输出每一个 * 时不能换行，一行输出完后再换行
				//控制只输出每行的都一个和最后一个*，最后一行全部输出，其他位置输出空格
				if (j == 1 || j == 2 * i - 1 || i == totalNum) {
					System.out.print ("*");
				}else {
					System.out.print (" ");
				}		
			}
			//每行输出完，退出进入下一行前，控制换行
			System.out.println();		
		}
	}
}