public class ArrayAssign {
	public static void main (String[] args) {
		
		int n1 = 10;
		int n2 = n1;
		n2 = 100;
		System.out.println ("n1=" + n1);
		System.out.println ("n2=" + n2);
		System.out.println ("=========================");
		
		int[] arr1 = {1,2,3};
		int[] arr2 = arr1;
		arr2[0] = 10;
		for(int i = 0; i < arr1.length; i++) {
			System.out.print (arr1[i] + "\t");
		}	
		System.out.println ();
		for(int j = 0; j < arr2.length; j++) {
			System.out.print (arr2[j] + "\t");
		
		}
	}
}