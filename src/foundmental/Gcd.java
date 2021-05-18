package foundmental;

import StdUtils.StdOut;

public class Gcd {
    public static int gcd(int p,int q){
        StdOut.println(p+" "+q);
        if(p%q==0)return q;
        else return gcd(q,p%q);
    }

    public static void main(String[] args) {
        StdOut.println(gcd(4,6));
    }
}
