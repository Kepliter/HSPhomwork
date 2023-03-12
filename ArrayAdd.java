import java.util.Scanner;
public class ArrayAdd {
	public static void main (String[] Args) {
		//定义原始数组arr
		int[] arr = {1,2,3};
		//new Scanner 对象
		Scanner sca = new Scanner(System.in);
		while(true) {
			int[] arrNew = new int [arr.length + 1];
			for (int i = 0; i < arr.length; i++) {
				arrNew[i] = arr[i];
			}	
				System.out.println ("请输入要添加的元素");
				int addNum = sca.nextInt();
				arrNew[arrNew.length - 1] = addNum;
			
				arr = arrNew;
			System.out.print ("arr扩容后为：");
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
			System.out.println ();
			System.out.println ("是否继续添加元素(y/n)");
			char key = sca.next().charAt(0);
			if(key == 'n') {
				break;
			}
		}
		System.out.println ("已退出元素添加操作");
	}
}