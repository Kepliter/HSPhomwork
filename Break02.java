import java.util.Scanner;
public class Break02 {
	public static void main (String[] args) {
		/*要求：
		 * 	ログイン認証を実現し、3回の機会があり、
		 * 	正しいユーザー名は「chenchen」、パスワードは「0000」です。
			入力が正しい場合、ログイン成功を表示し、
			そうでない場合は残りの入力回数を表示します。
			（for break）
			
		 *思路分析：
			1. scannerオブジェクトを作成する
			2. ユーザー名name、パスワードpasswdを定義する
			3. ユーザーに入力を促し、入力データを記録する
			4. 入力データを正しいデータと比較して、等しいかどうかを確認する（equals）
			正しい場合は終了し、間違っている場合は残りの回数を表示して再入力を促す。
		 */
		String name = "";
		String passwd = "";
		int chance = 3;
		Scanner sca = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.println ("ユーザー名を入力してください");
			name = sca.next ();
			System.out.println ("パスワードを入力してください");
			passwd = sca.next ();
			if("chenchen".equals(name) && "0000".equals(passwd)) {
				System.out.println ("ログインに成功しました");
				break;
			}else {
				chance--;
				if (chance == 0) {
					System.out.println ("入力回数の上限に達しました。お問い合わせください。");
				}else {
					System.out.println ("あと" + chance + "回入力できます");
				}
				}
		}	
	}
}