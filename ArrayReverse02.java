public class ArrayReverse02{
	public static void main (String[] Args) {
		int[] arr1 = {11,22,33,44,55,66,77};
		//定义一个新数组arr2，大小arr1.length
		int[] arr2 = new int[arr1.length];
		//倒序遍历arr1元素，再将遍历的值正序赋给arr2
		for(int i = arr1.length - 1, j = 0; i>=0; i--, j++) {
			arr2[j] = arr1[i];
		}
		//将arr2赋值给arr1，得到arr1的翻转数组。
		arr1 = arr2;
		//遍历输出
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}