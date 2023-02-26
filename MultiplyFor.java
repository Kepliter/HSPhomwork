import java.util.Scanner;

public class MultiplyFor {
	public static void main (String[] Args) {
		
		Scanner sca = new Scanner (System.in);
		//double classScoreSum = 0;
		double allSum = 0;
		int allPassNum = 0;
		int classNum = 3;
		int stuNum = 5;
		for(int j =1; j <= classNum; j++) {
			double classSum = 0;
			int classPassNum = 0;
			for(int i = 1; i <= stuNum; i++){
				System.out.println (j+"クラス"+i+"番学生の成績を入力してください");
				double score = sca.nextDouble ();
				System.out.println (j+"クラス"+"の"+i+"番学生の成績は"+score);
					if(score >= 60) {
						classPassNum++;
					}
				classSum += score;
			}
			System.out.println (j+"クラス総得点="+classSum+'\n'+
								j+"クラス平均点="+classSum/stuNum);
			System.out.println (j+"クラス合格者数="+classPassNum);
			allSum += classSum;
			allPassNum += classPassNum;
		}
		System.out.println ("学年総得点="+allSum+'\n'+
							"学年平均点="+allSum/(classNum * stuNum));
		System.out.println ("学年合格者数="+allPassNum);
	}
}