package io.github.sarabethcash;

import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        One objectOne = new One();
        objectOne.msg();

        Two objectTwo = new Two();
        objectTwo.sum();

        Three objectThree = new Three();
        objectThree.dividend();

        Four objectFour = new Four();
        objectFour.operations();

        System.out.print("\nEnter 2 numbers: ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        Five objectFive = new Five();
        objectFive.product(x, y);

        System.out.print("\nEnter 2 number: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        Six objectSix = new Six();
        objectSix.operations(a, b);

        System.out.print("\nEnter 1 numbers: ");
        int c = scan.nextInt();
        Seven objectSeven = new Seven();
        objectSeven.timesTable(c);

        Eight objectEight = new Eight();
        objectEight.msg();

        Nine objectNine = new Nine();
        objectNine.compute();

        Ten objectTen = new Ten();
        objectTen.compute();
    }
}