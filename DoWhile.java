import java.util.Scanner;

public class DoWhile {
	public static void main (String[] args) {
		
		Scanner sca = new Scanner(System.in);
		char anwser = ' ';
		
		do {
			System.out.println ("1+1等不等于2(y/n)");
			anwser = sca.next ().charAt(0);
			System.out.println ("你的回答是：" + anwser);
		}while( anwser != 'y' );
	}
}
		//????
		/*Scanner sca = new Scanner(System.in);
		String anwser = "";
		
		do {
			System.out.println ("1+1等不等于2(yes/no)");
			anwser = sca.next ();
			System.out.println ("你的回答是：" + anwser);
		}while( anwser != "yes" );
		*/