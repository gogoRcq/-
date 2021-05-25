package foundmental;

import StdUtils.StdOut;

/**
 * @Description: 计数器类
 * @Author: carryrccq@qq.com
 * @Date: 2021/5/24 14:32
 **/
public class Counter {
    private final String name;

    private int count;

    public Counter(String name) {
        this.name = name;
    }

    public void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return name+":"+count;
    }

    public static void main(String[] args) {
        Counter head=new Counter("head");
        head.increment();
        StdOut.println(head);
    }
}
