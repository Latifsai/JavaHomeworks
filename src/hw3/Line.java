package hw3;

import java.util.Scanner;

public class Line {
    public static void main(String[] args) {
        int metod = (int) (1 * Math.pow(2,5) + 1 * Math.pow(2,4) + 1 * Math.pow(2,3) + 1 * Math.pow(2,2) + 0 * Math.pow(2,1) + 1 * Math.pow(2,0));
        int metod1 = (int) (1* Math.pow(2,5) + 1 * Math.pow(2,4) + 0 * Math.pow(2,3) + 0 * Math.pow(2,2) + 1 * Math.pow(2,1) + 1 * Math.pow(2,0));
        int metod2 = (int) (1 * Math.pow(2,5) + 0 * Math.pow(2,4) + 1 * Math.pow(2,3) + 0 * Math.pow(2,2) + 0 * Math.pow(2,1) + 1 * Math.pow(2,0));
        int say;

        Scanner in = new Scanner(System.in);


        System.out.println("Введите число двоичной системы:111101, 110011, 101001");
        say= in.nextInt();

        if (say == 111101) {
            System.out.println("Ответ в десятичной системе будет равен: " + metod);
        }
        if (say == 110011) {
            System.out.println("Ответ в десятичной системе будет равен: " + metod1);
        }
        if (say == 101001 ) {
            System.out.println("Ответ в десятичной системе будет равен: " + metod2);
        }

    }
}
