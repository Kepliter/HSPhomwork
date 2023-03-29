import java.util.Scanner;
public class SeqSearch {
	public static void main(String[] Args) {
		String [] names = {"张三","李四","王麻子","赵六"};
		Scanner sca = new Scanner(System.in);
		System.out.println ("请输入名字");
		String inputname = sca.next();
		int index = -1;
		for (int i = 0; i < names.length; i++) {
			if(inputname.equals(names[i])) {
				System.out.println ("恭喜找到" + inputname);
				System.out.println ("下标=" + i);
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println ("没找到" + inputname);
		}
	}
}