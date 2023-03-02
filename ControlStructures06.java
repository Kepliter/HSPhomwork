public class ControlStructures06 {
	public static void main (String[] args) {
		/*要求：
		 * 小文字のaからzまでのアルファベットと
		 * 大文字のZからAまでのアルファベットを出力する
		 *思路分析：
		  文字型変数iを定義し、aで初期化し、i<=z,i++;
		  同様に、文字型変数jを定義し、Zで初期化し、j>=A,j--;。
		*/
		for(char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.print(c1 + " ");
		}
		System.out.println();
		for(char c2 = 'Z'; c2 >= 'A'; c2--){
			System.out.print(c2 + " ");
		}
		
	}
	
}