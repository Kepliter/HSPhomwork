public class RecursionMonkey{
    public static void main(String[]Args) {
        int day = 2;// 定义天数day
        MonkeyPeach monkeyPeach = new MonkeyPeach();// 创建 MonkeyPeach 类对象
        int peachNum = monkeyPeach.peach(day);// 调用 peach 方法，传入天数，得到剩余桃子数
        if(peachNum != -1) {// 如果返回剩余桃子数不为-1，即天数在正确范围内，则输出剩余桃子数
            System.out.println("第" + day + "天开始有" + peachNum +"个桃子");
        }
    }
}

/* 猴子吃桃：
 * 每天吃掉总桃数的一半后，再多吃一个。第10天的时候，（还没吃时）只剩1个桃子。
 * 代码实现任意天数的剩余桃子数量。
 * 倒推：
 * 第10天，开始有1个桃子，即第9天吃完剩1个桃子
 * 第9天，x - （x/2 + 1）= 1，x = （1 + 1）* 2 = 4，即第8天吃完剩4个（第9天的桃子数）
 * 第8天，x - （x/2 + 1）= 4，x = （4 + 1）* 2 = 10，即第7天吃完剩10个（第8天的桃子数）
 * 第7天，x - （x/2 + 1）= 10，x = （10 + 1）* 2 = 22，即第6天吃完剩10个（第7天的桃子数）
 * ......
 * 当天剩余桃子数 = 次日开始有的桃子数
 * 即，第day天开始的桃子数=（当天剩下的桃子 + 1）*2
 */
class MonkeyPeach {
    public int peach(int day) {// 定义 peach 方法，传入天数，返回剩余桃子数
        if(day == 10) {// 如果天数为10，则只剩一个桃子，返回1
            return 1;
        } 
        else if(1 <=day && day <= 9) {// 如果天数在1到9之间，则根据递推公式计算剩余桃子数
            return (peach(day + 1) + 1) * 2;
        } 
        // 如果天数小于1或大于10，则无法计算，输出提示信息并返回-1
        else {
            System.out.println("只够吃10天");
            return -1;
        }
    }
}
