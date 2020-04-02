package Lesson3;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую корни квадратного уравнения
 * вида ax ² + bx + c = 0, где a, b и c - вводимые пользователем из консоли
 * данные.
 *     Учитывать только реальные корни (в случае отрицательного
 * дискриминанта выводить сообщение пользователю).
 *     При решении создать и использовать следующие вынесенные
 * функции:
 *     - функция isPositive, определяющая, является ли число
 * положительным
 *     - функция isZero, определяющая, является ли число нулём
 *     - функция discriminant, вычисляющая дискриминант
 */

public class quadratic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а: ");
        double a = scanner.nextDouble();
        System.out.println("Введите b: ");
        double b = scanner.nextDouble();
        System.out.println("Введите c: ");
        double c = scanner.nextDouble();
        System.out.println("Введено уравнение: " + a + "x^2" + b + "x" + c + "=0");

        double dis = discriminant(a, b, c);
        if (!isPositive(dis)) {
            System.out.println("Дискриминант <0, уравнение не имеет корней");
        } else {
            double x1 = (b * (-1) + Math.sqrt(dis)) / (2 * a);
            double x2 = (b * (-1) - Math.sqrt(dis)) / (2 * a);
            System.out.println("Дискриминант >0, уравнение имеет 2 корня:");
            System.out.println("х1 =  " + x1);
            System.out.println("х2 =  " + x2);
        }
        if (isZero(dis)) {
            double x1 = -b / (2 * a);
            System.out.println("Дискриминант = 0, уравнение имеет 1 корень:");
            System.out.println("х1 = " + x1);

        }


    }


    public static boolean isPositive(double d) {
        return (d > 0);
    }

    public static boolean isZero(double q) {
        return (q == 0);
    }

    public static double discriminant(double a, double b, double c) {
        return ((b * b) - (4 * a * c));

    }
}