public class ControlStructures05 {
	public static void main(String[] args) {
		/*要求：1から100までのうち、5で割り切れない数を5つずつ一行で表示する
		*
		* 思路分析：
		* num=1と定義し、1-100までの数を出力し、その中から5で割り切れない数を選択する。
		* 変数countを定義し、数が出現するたびにカウントする。
		* count % 5 == 0 の場合、改行する。
		*/
		int count = 0;
		for(int num = 1; num <= 100; num++) {
			if(num % 5 != 0) {
				System.out.print (num + "\t");
				count++;
				if(count % 5 == 0) {
					System.out.println ();
				}
			}
		}
	}
}