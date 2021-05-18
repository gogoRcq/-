package foundmental;

import StdUtils.StdIn;
import StdUtils.StdOut;

import java.util.Vector;

public class Readline {
    /**
     * @Description: 按行读取数据，并制作表格输出
     * @Param: []
     * @Return: void
     * @Author: carryrccq@qq.com
     * @Date: 2021/5/6 10:46
     **/
    public static void readline(){
        Vector<student> v=new Vector<>();
        while (!StdIn.isEmpty()){
            String s=StdIn.readLine();
            String[] str=s.split(" ");
            v.add(new student(str[0],Double.parseDouble(str[1]),Double.parseDouble(str[2])));
        }
        for(student s : v){
            s.display();
        }
    }

    public static void main(String[] args) {
        readline();
    }

    private static class student{
        private String name;
        private double score;
        private double base;

        public student(String name, double score, double base) {
            this.name = name;
            this.score = score;
            this.base = base;
        }


        public void display(){
            if(base==0){
                StdOut.println(name+" "+score+" "+base+" 无法计算");
            }else{
                StdOut.printf(name+" "+score+" "+base+" %.3f\n",score/base);
            }
        }

    }
}
