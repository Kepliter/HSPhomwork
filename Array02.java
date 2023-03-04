public class Array02 {
	public static void main (String[] args) {
		/*要求：
		* char型の26要素の配列を作成し、それぞれが 'A' - 'Z' である
		* forループを使用してすべての要素を問い合わせ、出力する。
		*
		* 思路分析：
		* (1) char型の配列を定義します。 char[] chars = new char[26];
		* (2) (char) ('A' + 1) = 'B' など、forループを使用して値を割り当てます。
		* (3) forループですべての要素を反復処理し、出力します。
		*/
		char[] chars = new char[26];
		for(char i = 0; i < chars.length; i++) {
			//chars是 char[] 类型
			//chars[i] 是chars中的第i位的元素，是char类型
			//'A'+i是一个int类型的数据，需要强转
			chars[i] = (char)('A' + i);
			System.out.print (chars[i] + " ");
		}
	}
}