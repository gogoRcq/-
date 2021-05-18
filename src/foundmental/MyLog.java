package foundmental;

import StdUtils.StdOut;

/**
 * 1.1.14
 * 模仿lg2函数
 */
public class MyLog {


    /**
     * @Description: 返回不大于log2(n)的最大整数
     * @Param: [n]
     * @Return: int
     * @Author: carryrccq@qq.com
     * @Date: 2021/5/5 17:14
     **/
    public static int log(int n){
        if(n<2) return 0;
        int count=0,now=2;
        while(n >= now){
            now*=2;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        StdOut.println(log(17));
    }
}
