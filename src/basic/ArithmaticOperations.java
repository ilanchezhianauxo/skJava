package basic;

import java.util.Scanner;

public class ArithmaticOperations {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int x,y;
        System.out.println("enter 2 operands");
        x=in.nextInt();
        y=in.nextInt();

        System.out.println(add(x,y));
             int diff=   sub(x,y);
        System.out.println("difference="+sub(x,y));
        System.out.println("product="+product(x,y));
    }
   static int add(int a1,int a2)
    {

       return a1+a2;

    }
    static int sub(int a1,int a2)
    {

        return a1-a2;
    }
    static int product(int a1,int a2)
    {

        return a1*a2;
    }
}
