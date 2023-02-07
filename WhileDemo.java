public class WhileDemo {
	public static void main (String[] arrgs) {
		int i = 1;
		int endNum = 100;
		int bei = 3;
		while ( i <= endNum) {
			if ( i % bei == 0 ) {
				System.out.println ("i=" + i );
			}
		i++;
		}
		System.out.println ("===========================");
		int j = 40;
		int endNum2 = 200;
		while ( j <= endNum2) {
			if ( j % 2 == 0) {
				System.out.println ("j=" + j );
			}
		j++;
		}
	}
}