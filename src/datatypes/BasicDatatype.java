package datatypes;

public class BasicDatatype {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        a=5;
        b=15;
        c=a+b;
        System.out.println("sum of  "+a+" and  "+b+" is  "+c);
        c=a-b;
        System.out.println("difference "+a+" and  "+b+" is  "+c);
        c=a*b;
        System.out.println("product of  "+a+" and  "+b+" is  "+c);
        float q=(float)a/b;//21/5
        System.out.println("quotient of  "+a+" and  "+b+" is  "+q);
        c=a%b;
        System.out.println("remainder of  "+a+" and  "+b+" is  "+c);


    }
}
