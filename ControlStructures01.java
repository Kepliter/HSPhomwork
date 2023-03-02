public class ControlStructures01 {
	public static void main (String[] args) {
		
		/*要求：
		* 交通費に使うため、10万円がある。支払いルールは以下のとおりです。
		* （1）残高 > 50000の場合、残高の5％を支払う。
		* （2）残高 <= 50000の場合、1000円を支払う。
		* 10万円で何個の交差点を通過できるかを計算するプログラムを作成します
		*（while break）。
		
		* 思考過程：
		* 変数moneyを定義して、doubleデータ型で受け取ります。
		* 場合a：money > 50000；
				money *= 0.95；
		* 場合b：money >= 1000 && money <= 50000；
				money -= 1000；
		* 場合c：money < 1000；支払い不足
				break；
		*/
		double money = 100000;
		int count = 0;
		while (money > 0) {
			if (money > 50000) {
				money *= 0.95;
				count++;
			}else if (money >= 1000) {
					money -= 1000;
					count++;
				}else {
					break;
				}
		}
		System.out.println ("100000円で" + count + "個の交差点を通り抜けて"
		+ "\n" +  money + "円残っています");
	}
}