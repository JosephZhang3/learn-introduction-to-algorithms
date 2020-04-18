package priv.wishingpep.ita.chap2;

public class InsertSort {
    /*
    * 插入排序算法
    * first loop,i=0,j=1,compare intArr[0] with key(intArr[1])
    * if intArr[0] > key
    * intArr[1] = intArr[0]
    * intArr[0]=intArr[1]
    * second loop,i=1,j=2,key(intArr[2])
    * if intArr[1]>key
    */
    public static final void main(String args[]) {
        int[] intArr = {24, 13, 83, 99, 32, 0, 34, 35, 36, 7};
        int key;
        int i;
        for (int j = 1; j < 10; j++) {
            key = intArr[j];//key是一个临时的变量（可以看成一个容器）
            i = j - 1;
            while (i >= 0 && intArr[i] > key) {
                intArr[i + 1] = intArr[i];
                intArr[i] = key;
                --i;
            }
        }
        System.out.println("插入排序的结果?");
        for (int k = 0; k < 10; k++) {
            System.out.print(intArr[k] + ",");
        }
    }
}