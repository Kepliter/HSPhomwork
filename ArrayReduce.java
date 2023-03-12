import java.util.Scanner;
public class ArrayReduce {
	public static void main (String[] Args) {
		//定义原始数组arr
		int[] arr = {1,2,3,4,5};
		//new Scanner 对象
		Scanner sca = new Scanner(System.in);
		int len = arr.length;
		while(true) {
			System.out.print("原始数组为：");
			for (int i = 0; i < len; i++) {
				System.out.print(arr[i] + " ");
			}	
			//System.out.println ();
			System.out.println ("\n是否缩减数组(y/n)");
			char key = sca.next().charAt(0);
			if(key == 'y') {
				if(len > 1) {
					len--;
				}else {
					System.out.println ("不能再继续缩减");
					break;
				}	
			}else if (key == 'n') {
				break;
			}	
		}
		System.out.println ("已退出元素添加操作");
	}
}