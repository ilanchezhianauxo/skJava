package basic;

import datatypes.BasicDatatype;

public class VarTypes
{

    int a=20;//instance variables
    static int c=30;//static variables


    public static void main(String[] args)
    {
Arithematic a=new Arithematic();

       int c;
       c=50;
        System.out.println( c);
        System.out.println(VarTypes.c);

        System.out.println(BasicDatatype.ab);
        VarTypes v=new VarTypes();
        System.out.println(v.a);
        v.sarika();
    }

    void sarika()
    {
        System.out.println(a);
        System.out.println(c);
    }
}