package foundmental;

import StdUtils.StdOut;

public class BinarySearch {

    /**
     * @Description: 二分查找递归实现
     * @Param: []
     * @Return: int
     * @Author: carryrccq@qq.com
     * @Date: 2021/5/6 14:21
     **/
    public static int rank(int a,int[] v,int low,int high,int deep){
        for(int i=0;i<deep;i++){
            StdOut.print("\t");
        }
        StdOut.println(low+" "+high);
        int mid=(low+high)/2;
        if(low==high&&v[mid] != a) return -1;
        else if(v[mid] == a) return mid;
        if(v[mid] < a) return rank(a,v,mid+1,high,deep+1);
        else return rank(a,v,low,mid-1,deep+1);
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        StdOut.println(rank(4,a,0,9,0));
    }
}
