public class ArryCopy01 {
	public static void main (String[] args) {
		int[] arr1 = {10,20,30};
		int[] arr2 = new int [arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		arr2[0] = 100;
		System.out.println("arr1的值是：");
		for (int i = 0; i < arr1.length; i++) {
		System.out.print(arr1[i] + "\t");
		}
		System.out.println ();
		System.out.println("arr2的值是：");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");
			}
	}
}