package basic;

public class VarTypes {

    int a=20;//instance variables
    static int b=30;//static variables


    public static void main(String[] args)
    {


        int b; //local variables
        b=10;
        System.out.println("value of b="+ VarTypes.b);
        VarTypes obj=new VarTypes();
        obj.sarika();

    }

    void sarika()
    {
        System.out.println("this is inside print method="+b);
    }
}