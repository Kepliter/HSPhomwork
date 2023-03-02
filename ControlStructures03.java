import java.util.Scanner;
public class ControlStructures03 {
	public static void main (String[] args) {
		Scanner sca = new Scanner (System.in);
		System.out.println ("西暦を入力してください");
		int year = sca.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println (year + "年はうるう年です。");
		}else {
			System.out.println (year + "年はうるう年ではありません。");
		}
	}
}