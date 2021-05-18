package foundmental;

import StdUtils.StdOut;

/**
 * 1.1.13
 * 实现二维数组的转置（包含展示）
 *
 * java中二维数组的行列数获得方式：
 *     int[][] a
 *     行数 = a.length    因为二维数组第二维度是以一行数组为元素
 *     列数 = a[0].length 列数即为第二维度元素（数组）中元素的长度
 */

public class TurnBinaryArray {
    public static void turnbinaryarray(int[][] a){

        for(int i = 0;i < a.length;i++){
            for (int j = i;j < a[0].length;j++){
                if(i!=j) {
                    int temp = a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
            }
        }
    }
    
    /**
     * @Description: RCQ
     * @Param: [a]
     * @Return: void
     * @Author: carryrccq@qq.com
     * @Date: 2021/5/5 17:09
     **/

    public static void displaybinaryarray(int[][] a){
        for(int i = 0;i < a.length;i++){
            for (int j = 0;j < a[0].length;j++){
                StdOut.print(a[i][j]+" ");
            }
            StdOut.println("");
        }
    }

    //test

    public static void main(String[] args) {
        int[][] a={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        TurnBinaryArray.turnbinaryarray(a);
        TurnBinaryArray.displaybinaryarray(a);
    }
}
