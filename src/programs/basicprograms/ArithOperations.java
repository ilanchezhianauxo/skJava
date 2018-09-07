package programs.basicprograms;

import java.util.Scanner;

public class ArithOperations
{
    static Scanner in=new Scanner(System.in);

    public static void main(String[] args)
    {

        int op1;
        int op2;
        double div;
        System.out.println("enter first operand");
        op1=in.nextInt();
        System.out.println("enter second operand");

        op2=in.nextInt();

        div=(double)op1/op2;
        System.out.println("division="+div);

        // modulus operator %-remainder
        int r;
       r=remainder(op1,op2);
        System.out.println("remainder="+r);
    }
   static int remainder(int n1,int n2)
    {
        return n1%n2;
    }
    static void square()
    {
        int n;
        System.out.println("enter a no to find square");
        n=in.nextInt();
        System.out.println("square="+n*n);

    }
}
