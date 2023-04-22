public class RecursionMiGong{
	public static void main(String[]Args) {
		//定义二维数组map
		//在map中，元素0表示可以走，1表示墙，不能走
		int[][] map = new int[8][7];
		map[3][1] = 1;
		map[3][2] = 1;
		//第一行与最后一行设置为1，表示迷宫上下边界
		for(int i = 0; i < 7; i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//第一列与最后一列设置为1，表示迷宫左右边界
		for(int i = 0; i < 8; i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
		System.out.println("=======迷宫map=======");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j< map[i].length; j++) {
				System.out.print(map[i][j] + "  ");
			}
			System.out.println();
		}
		//创建Mouse对象mouse
		Mouse mouse = new Mouse();
		mouse.findWay(map, 1, 1);
		System.out.println("======出迷宫路线======");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j< map[i].length; j++) {
				System.out.print(map[i][j] + "  ");
			}
			System.out.println();
		}
	}
}

class Mouse{
	/*递归回溯解决老鼠出迷宫问题
	 *创建findWay方法，找到返回true，否则返回false
	 *二维数组map表示迷宫地图，（i，j）表示老鼠位置
	 *各位置对应一个元素，0:能走且未走，1:墙，2:能走且已走，3:试了走不通
	 *初始位置为（1，1），退出位置为（6，5）
	 *当map[6][5]=2，找到出口，结束代码执行，否则继续找
	 *我们要自己规定老鼠的找路策略。比如上 ➡ 右 ➡ 下 ➡ 左。
	 */
	public boolean findWay(int map[][], int i, int j) {
		if(map[6][5] == 2) {//说明已经找到出口，即递归结束条件
			return true;
		}else {
			//map[i][j] == 0成立说明此坐标能走，且未向其他方向走
			if(map[i][j] == 0) {
				map[i][j] = 2;//假设可以向其他方向走，则将此处标记为2
				//开始尝试向其他方向走
				if(findWay(map, i-1, j)) {//上
					return true;
				}else if(findWay(map, i, j+1)) {//右
					return true;
				}else if(findWay(map, i+1, j)) {//下
					return true;
				}else if(findWay(map, i, j-1)) {//左
					return true;
				}else {//四个方向都走不通，则将该位置标记为3，且返回false
					map[i][j] = 3;
					return false;
				}
			//map[i][j] == 0不成立，那此处的可能值为1，2，3	
			}else {
				return false;
			}
		}
	}
}