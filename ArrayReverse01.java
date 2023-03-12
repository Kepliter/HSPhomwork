public class ArrayReverse01 {
	public static void main (String[] Args) {
		int[] arr = {11,22,33,44,55,66,77};
		//定义临时变量temp，作为第三方变量，用于临时存储数组中的数据
		int temp = 0;
		//最远距离元素位置两两交换，交换次数：arr.length/2，遍历
		for (int i = 0; i < arr.length/2; i++) {
			//先将arr[i]赋值给临时变量temp
			temp = arr[i];
			//将后段元素值赋给对应前段元素
			arr[i] = arr[arr.length -1 -i];
			//再将临时变量记录的前段元素值赋给对应后段元素
			arr[arr.length -1 -i] = temp;
		}
		//遍历，输出
		for (int i = 0; i < arr.length; i++) {
			System.out.print (arr[i] + " ");
		}
	}
}