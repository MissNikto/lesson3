package Lesson3;

/**
 * Имеются три числа - день, месяц и год, вводимые пользователем с
 * консоли.
 *     Вывести дату следующего дня в формате &quot;День.Месяц.Год&quot;.
 *     Учесть переход на следующий месяц, а также следующий год.
 *     Форматирование строки &quot;День.Месяц.Год&quot; вынести в отдельную
 */

import java.sql.SQLOutput;
import java.util.Scanner;


public class data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день");
        int day = scanner.nextInt();
        System.out.println("Введите месяц");
        int month = scanner.nextInt();
        System.out.println("Введите год");
        int year = scanner.nextInt();


        printNextDate(day, month, year);
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0));
    }


    public static void printNextDate(int day, int month, int year) {
        if (day <= 0 || month <= 0 || year <= 0) {
            System.out.println("Не верно введена дата");
        }
        if (isLeapYear(year) && month == 2) {
            if (month == 2 && day >= 1 && day <= 28) {
                System.out.println(++day + "." + month + year);
            } else if (month == 2 && day == 29) {
                System.out.println("01" + "." + ++month + "." + year);
            } else if (month == 2 && day >= 30) {
                System.out.println("Не верно введена дата, т.к. нет такого дня в феврале");
            }
        } else if (!isLeapYear(year) && month == 2) {
            if (month == 2 && day >= 1 && day <= 27) {
                System.out.println(++day + "." + month + year);
            } else if (month == 2 && day == 28) {
                System.out.println("01" + "." + ++month + "." + year);
            } else if (month == 2 && day == 29) {
                System.out.println("Не верно введена дата, т.к. год не високосный");
            } else if (month == 2 && day >= 30) {
                System.out.println("Не верно введена дата, т.к. нет такого дня в феврале");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day >= 1 && day <= 29) {
                System.out.println(++day + "." + month + "." + year);
            } else if (day == 30) {
                System.out.println("01." + ++month + "." + year);
            } else if (day >= 31) {
                System.out.println("Нет такого дня в " + month + " месяце");
            }
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

            if (day >= 1 && day <= 30) {
                System.out.println(++day + "." + month + "." + year);
            } else if (day == 31 && month != 12) {
                System.out.println("01." + ++month + "." + year);
            } else if (month == 12 && day == 31) {
                System.out.println("01." + "01." + ++year);
            } else if (day >= 32) {
                System.out.println("Нет такого дня в " + month + " месяце");
            }
        } else {

            if (month >= 13) {
                System.out.println("Нет такого месяца в году");
            }
        }
    }
}


