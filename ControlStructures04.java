import java.util.Scanner;
public class ControlStructures04 {
	public static void main (String[] args) {
		Scanner sca = new Scanner (System.in);
		System.out.println("三桁の整数を入力してください");
		int num = sca.nextInt();
		int hundreds = num / 100;
		int tens = num / 10 % 10;
		int units = num % 10;
		if (num == (Math.pow(hundreds, 3) + Math.pow(tens, 3) + Math.pow(units, 3))) {
			System.out.println (num + "は水仙花数です");
			}else {
				System.out.println (num + "は水仙花数ではありません");
			
	}
}
}	