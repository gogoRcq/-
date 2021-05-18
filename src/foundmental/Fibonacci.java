package foundmental;

import StdUtils.StdOut;

public class Fibonacci {

    /**
     * @Description: 求菲波那切数列的元素大小
     * @Param: [n]
     * @Return: long
     * @Author: carryrccq@qq.com
     * @Date: 2021/5/6 10:44
     **/

    public static long fibonacci(int n){
        long[] dp=new long[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        StdOut.println(fibonacci(24));
    }
}
