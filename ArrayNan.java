import java.util.Scanner;
public class ArrayNan {
    public static void main(String[] args) {
    	/*
    	 升序数组{10, 12, 45, 90}，插入一个元素23，数组元素依然升序排列
    	 即{10, 12, 23, 45, 90}
    	 */
        int[] arr = {10, 12, 45, 90}; // 初始化升序数组
        //int addNum = 32;
        int index = -1;
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入要插入的数值");
        int addNum = sca.nextInt();
        /*遍历原数组，比较输入数值与元数组元素大小
         *当addNum < arr[i]时，index记录下标（位置），且break。
         *addNum < arr[i]的情况不存在，那么不进入if循环，
         *即index的值仍然等于-1，此时，插入位置为数组最后，
         *即index = arr.length。
         *找到addNum在数组中的插入位置
         */
        for(int i = 0; i < arr.length; i++) {
        	if(addNum < arr[i]) {
        		index = i;
        		break;
        	}
        }
        if(index == -1) {
        	index = arr.length;
        }
        System.out.println("addNum插入位置是： " + index);
        /*
         * 创建新数组，长度是arr.length + 1
         * 进行拷贝，
         * 新数组中下标为index的位置放入addNum，其他位置按顺序放入原数组元素。
         */
        int[] arrNew = new int[arr.length + 1];
        for(int j = 0, i = 0; j < arr.length + 1; j++) {
        	if(j != index) {
        		arrNew[j] = arr[i];
        		i++;
        	}else {
        		arrNew[j] = addNum;
        	}
        }
        arr = arrNew;
        System.out.println("新数组为：");
        for(int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i] + " ");
        }
    }
}
