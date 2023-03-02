public class ControlStructures07 {
	public static void main (String[] Args) {
		/*要求：
		  1-1/2+1/3-1/4+1/5-1/6...1/100の計算結果を求める。
		
		 *思路分析：
		  double型の変数sumを定義して、計算結果を保存する。
		  分子は全て1で、
		  分母が奇数の場合、+。
		  分母が偶数の場合、-。
		*/
		double sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				sum += 1.0/i;
			}else {
				sum -= 1.0/i;
			}
		}
		System.out.println ("sum=" + sum);
	}
	
}