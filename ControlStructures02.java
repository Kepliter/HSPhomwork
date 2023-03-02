import java.util.Scanner;
public class ControlStructures02 {
	public static void main (String[] args) {
		/*要求：実数がどの範囲に属するかを判断することを実現する
		* 大于0；等于0；小于0
		*
		* 思路分析：
		* Scannerオブジェクトを作成する
		* ユーザーによる整数の入力と記録
		* この入力データと0の大小関係を判断し、対応する結果を出力する
		*/
		Scanner sca = new Scanner (System.in);
		System.out.println ("整数を入力してください");
		int num = sca.nextInt();
		if (num == 0) {
			System.out.println ("入力された整数は0です");
		}else if(num < 0) {
			System.out.println ("入力された整数は0未満です");
		}else {
			System.out.println ("入力された整数は０の以上です");
		}
	}
}