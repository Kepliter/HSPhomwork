public class VarLearn02 {
	public static void main (String[] args) {
		/*要求：
		 * 编辑保存，两本书名，用加号连接，并输出；
		 * 保存两个性别，用加号连接，输出；
		 * 保存两本书的价格，输出。
		*/
		String book1 = "《西游记》";
		String book2 = "《水浒传》";
		char c1 = '男';
		char c2 = '女';
		double price1 = 99.99;
		double price2 = 111.11;
		System.out.println (book1 + book2);//西游记水浒传
		System.out.println (c1 + c2);//52906（男的字符码值与女的字符码值相加）
		System.out.println (price1 + price2);
	}
}