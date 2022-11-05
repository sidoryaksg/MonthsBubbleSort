package org.bubblesort;

import java.time.Month;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        Month[] months = new Month[]{Month.APRIL,
                Month.DECEMBER,
                Month.AUGUST,
                Month.FEBRUARY,
                Month.JANUARY,
                Month.MARCH,
                Month.NOVEMBER,
                Month.OCTOBER,
                Month.SEPTEMBER,
                Month.MAY,
                Month.JUNE,
                Month.JULY
        };

        System.out.println("-------Проверяем первоначальный массив alphabetic------");
        checkArrayAlphabetic(months);
        System.out.println("-------Проверяем первоначальный массив ordinary------");
        checkArrayOrdinary(months);

        System.out.println("-------Сортируем ordinary-------");
        Month[] sortedOrdinary = months.clone();
        sortOrdinary(sortedOrdinary);
        checkArrayOrdinary(sortedOrdinary);

        System.out.println("-------Сортируем alphabetic-------");
        Month[] sortedAlphabetic = months.clone();
        sortAlphabetic(sortedAlphabetic);
        checkArrayAlphabetic(sortedAlphabetic);

    }

    private static void checkArrayOrdinary(Month[] months) {
        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < months.length - 1; i++) {
            if (months[i].ordinal() > months[i + 1].ordinal()) {
                System.out.println("Месяц № " +
                        (i + 1) +
                        " (" +
                        months[i] +
                        ") из списка больше последущего месяца " +
                        months[i + 1]);
            }
        }
    }

    private static void checkArrayAlphabetic(Month[] months) {
        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < months.length - 1; i++) {
            boolean val = checkAlphabetic(months[i].toString(), months[i + 1].toString());
            if (val == false) {
                System.out.println("Месяц № " +
                        (i + 1) +
                        " (" +
                        months[i] +
                        ") из списка больше последущего месяца " +
                        months[i + 1]);
            }
        }
    }

    private static boolean checkAlphabetic(String first, String second) {
        int stringLength;
        if (first.length() > second.length())
            stringLength = second.length();
        else
            stringLength = first.length();
        for (int i = 0; i < stringLength; i++) {
            if (first.charAt(i) < second.charAt(i)) {
                //System.out.println("Меньше, конец");
                return true;
            }
            else if (first.charAt(i) == second.charAt(i)) {
                //System.out.println("Равно, дальше");
                continue;
            }
            else
                break;
        }
        return false;
    }

    private static void sortOrdinary(Month[] months) {
        int bubbleLength = months.length;

        for (int bubblesEnd = bubbleLength - 1; bubblesEnd >= 0; bubblesEnd--) {
            for (int i = 0; i < bubbleLength - 1; i++) {
                if (months[i].ordinal() > months[i + 1].ordinal()) {
                    Month temp = months[i];
                    months[i] = months[i + 1];
                    months[i + 1] = temp;
                }
            }
        }
    }

    private static void sortAlphabetic(Month[] months) {

        int bubbleLength = months.length;

        for (int bubblesEnd = bubbleLength - 1; bubblesEnd >= 0; bubblesEnd--) {
            for (int i = 0; i < bubbleLength - 1; i++) {
                if (checkAlphabetic(months[i].toString(), months[i+1].toString()) == false) {
                    Month temp = months[i];
                    months[i] = months[i + 1];
                    months[i + 1] = temp;
                }
            }
        }

    }
}