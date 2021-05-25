package foundmental;


import StdUtils.StdOut;

/**
 * @Description: 矩阵库
 * @Author: carryrccq@qq.com
 * @Date: 2021/5/18 10:37
 **/

public class Matrix {

    /**
     * @Description: 向量点乘
     * @Param: [x, y]
     * @Return: double  如果维度不同范围Double.MIN
     * @Author: carryrccq@qq.com
     * @Date: 2021/5/18 10:53
     **/
    public static double dot(double[] x , double[] y){
        if(x.length!=y.length)return Double.MIN_VALUE;
        else{
            double dotvalue=0;
            for (int i = 0; i<x.length;i++){
                dotvalue+=x[i]*y[i];
            }
            return dotvalue;
        }
    }

    /**
     * @Description: 矩阵乘积
     * @Param: [a, b]
     * @Return: double[][]
     * @Author: carryrccq@qq.com
     * @Date: 2021/5/18 11:16
     **/
    public static double[][] mult(double[][] a,double[][] b){
        double[][] multresult=new double[a.length][b[0].length];
        if(a[0].length!=b.length)return multresult;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<b[0].length;j++){
                for (int k=0;k<b.length;k++){
                    multresult[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return multresult;
    }

    /**
     * @Description: 转置二维矩阵
     * @Param: [a]
     * @Return: void
     * @Author: carryrccq@qq.com
     * @Date: 2021/5/24 14:00
     **/
    public static double[][] reversebinaryarray(double[][] a){
        double[][] b=new double[a[0].length][a.length];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                b[j][i]=a[i][j];
            }
        }
        return b;
    }


    //test
    public static void main(String[] args) {
        double[] x={1,0,1};
        double[] y={1,1,1};
        double[][] x1={
                {1,2,3},
                {3,2,1}
        };
        double[][] y1={
                {1,1},
                {2,2},
                {3,3}
        };
        displaybinaryArray(reversebinaryarray(x1));
    }

    public static void displaybinaryArray(double[][] a){
        for (int i = 0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                StdOut.print(a[i][j]+" ");
            }
            StdOut.println();
        }
    }
}
