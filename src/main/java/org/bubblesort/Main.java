package org.bubblesort;
import java.time.Month;


public class Main {
    public static void main(String[] args) {

        Month[] months = new Month[]{Month.APRIL,
                Month.AUGUST,
                Month.DECEMBER,
                Month.FEBRUARY,
                Month.JANUARY,
                Month.MARCH,
                Month.NOVEMBER,
                Month.OCTOBER,
                Month.SEPTEMBER,
                Month.MAY,
                Month.JULY,
                Month.JUNE
        };
        printArray(months);

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
        printArray(months);


    }


    private static void printArray(Month[] months) {
        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < months.length-1; i++) {
            if (months[i].ordinal() > months[i+1].ordinal()){
                System.out.println("Месяц № " +
                        (i+1) +
                        " (" +
                        months[i] +
                        ") из списка больше последущего месяца " +
                        months[i+1]);
            }

        }
    }
}