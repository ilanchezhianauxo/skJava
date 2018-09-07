package programs.basicprograms;

import basic.ArithmaticOperations;

import javax.sound.midi.Soundbank;


public class Loan {
    public static void main(String[] args) {
        double p,n,r;
        p=1548;
        n=3;
        r=10.11;
         double si;

         si=Si.si(p,n,r);

        System.out.println(si);

        System.out.println(Cube.cube(10));
        int x,y;
        int rem;
        x=45;
        y=23;

        rem=ArithOperations.remainder(x,y);
        System.out.println(rem);
        ArithOperations.square();
    }
}
