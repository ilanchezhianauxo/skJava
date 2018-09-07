package programs.basicprograms;

import java.util.Scanner;

public class Si {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        double p;
        double n;
        double r;
        double si;

        System.out.println("enter principle amount");
        p=in.nextDouble();
        System.out.println("enter no of years");
        n=in.nextDouble();
        System.out.println("enter rate of interest");
        r=in.nextDouble();

        System.out.println(si(p,n,r));


    }
    static double si(double pr,double no,double rt)
    {
        return  (pr*no*rt)/100;
    }
}
