package programs.basicprograms;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int no;
        int result;
        no=in.nextInt();

        result=cube(no);
        System.out.println(result);

    }
    static int cube(int n) {
        return n * n * n;
    }
}
