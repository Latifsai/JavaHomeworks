package hw1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Напишите программу "Геометрический калькулятор",
        // который умеет вычислять и выводить на экран площадь прямоугольника.
        // Длины сторон - целые числа.
        // Добавьте в программу возможность вычисления площади параллелограмма.
        Scanner scanner = new Scanner(System.in);

        int width;
        int length;
        int height;

        String figur1 = "квадрат";
        String figur2 = "прямоугольник";
        String figur3 = "параллелограмм";
        String figur4 = "ромб";
        String str = "";


        System.out.println("Выберите вашу фигуру:");
        str = scanner.next();

        System.out.println("Введите парамерт ширины:");
        width = scanner.nextInt();

        System.out.println("Введите парамерт длины:");
        length = scanner.nextInt();

        System.out.println("Введите парамерт высоты:");
        height = scanner.nextInt();

        if (str.equals(figur1)) {
            System.out.println("Площадь квардрата равна: " + Math.pow(length,2));
        }
        if (str.equals(figur2)) {
            System.out.println("Площадь прямоугольника равна: " + height * length );
        }
        if (str.equals(figur3)) {
            System.out.println("Площадь параллелограмма равна: " + width * height );

        }
        if (str.equals(figur4)) {
            System.out.println("Площадь ромба равна: " + width * height );

        }

    }
}
