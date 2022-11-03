package org.bubblesort;


import java.time.DayOfWeek;
import java.time.Month;
enum Months {

    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}


public class Main {
    public static void main(String[] args) {




        Months[] months = new Months[]{Months.APRIL,
                Months.AUGUST,
                Months.DECEMBER,
                Months.FEBRUARY,
                Months.JANUARY,
                Months.MARCH,
                Months.NOVEMBER,
                Months.OCTOBER,
                Months.SEPTEMBER,
                Months.MAY,
                Months.JULY,
                Months.JUNE
        };
        printArray(months);

        int bubbleLength = months.length;

        for (int bubblesEnd = bubbleLength - 1; bubblesEnd >= 0; bubblesEnd--) {
            for (int i = 0; i < bubbleLength - 1; i++) {
                if (months[i].ordinal() > months[i + 1].ordinal()) {
                    Months temp = months[i];
                    months[i] = months[i + 1];
                    months[i + 1] = temp;
                }
            }
        }
        printArray(months);


    }


    private static void printArray(Months[] months) {
        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i] + " ");
        }
        System.out.println();
    }
}