public class RecursionFactorial {
    public static void main(String[] Args) {
        // 创建 Recursion02 类的实例 R
        Recursion02 R = new Recursion02();
        // 定义计算阶乘的数字 n
        int n = 4;
        // 调用 recursionFactorial 方法计算 n 的阶乘
        int res = R.recursionFactorial(n);
        // 输出计算结果
        System.out.println(n + "! = " + res);
    }
}

// 创建 Recursion02 类
class Recursion02 {
    // 定义递归方法计算阶乘
    public int recursionFactorial(int n) {
        // 判断 n 的值是否小于 2，即递归结束条件
        if (n < 2) {
            // 如果 n 的值小于 2，返回 1
            return 1;
        } else {
            //找出递归方程：
        	// 如果 n 的值不小于 2，递归调用 recursionFactorial 方法
            // 传入 n - 1 作为参数，再乘以 n，得到 n 的阶乘
            return recursionFactorial(n - 1) * n;
        }
    }
}
