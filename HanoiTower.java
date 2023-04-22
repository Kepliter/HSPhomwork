public class HanoiTower{
    public static void main(String[]Args) {
        //创建一个 Tower 类的实例
        Tower tower = new Tower();
        //调用 moveWay 方法，传入初始参数 3 和三个柱子 A、B、C
        tower.moveWay(3, 'A', 'B', 'C');
    }
}

//定义一个 Tower 类
class Tower{
    //定义一个递归方法，用于解决汉诺塔问题
    public void moveWay(int num, char a, char b, char c) {
        //如果只有一个盘子，直接从 A 移到 C
        if(num == 1) {
            System.out.println(a + "->" + c);  
        //如果不止一个盘子时，可把盘子看作两个，最底下一层，其他层看作一个整体（数量为num-1）    
        }else {
            //递归调用自身，将 n-1 个盘子从 A 经过 C 移到 B
            moveWay(num - 1, a, c, b);
            //将最后一个盘子从 A 移到 C
            System.out.println(a + "->" + c);
            //递归调用自身，将 n-1 个盘子从 B 经过 A 移到 C
            moveWay(num - 1, b, a, c);
        }
    }
}
