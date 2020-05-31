package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Calendar {

    private List<Holiday> holidays = new ArrayList<Holiday>();
    private char[] map = new char[366]; // w - раб день, h - вых

    public Calendar() {
        for (int i = 0; i < 366; i++) {
            if (i % 7 == 0) //Вск = выходной. Правда здесь календарь на один и тот же год, где 1 января = вск.
            {
                map[i] = 'h';

            } else {
                map[i] = 'w';
            }
        }
    }

    public class Holiday {

        private String name;
        private int date_strt;
        private int date_end;

        public Holiday(String s, int d1, int d2) {

            this.name = s;
            this.date_end = d2;
            this.date_strt = d1;

        }

    }

    public void AddHoliday(String s, int d1, int d2) {
        try {
            Holiday h = new Holiday(s, d1, d2);
            holidays.add(h);
            for (int i = d1; i < d2; i++) {

                map[i] = 'h';

            }
        }catch (InputMismatchException e1) {
            System.out.println("You make some mistakes, bro :C");
        }

    }

    public void Show() {

        System.out.println(map);

    }

    public void GetTypeDay(int i) { //Выводит тип дня (выходной или рабочий)
        try {
            System.out.println(map[i]);
        } catch (IndexOutOfBoundsException  e1) {
            System.out.println("Wrong day, bro :C");
        }
    }

}

