package practice3.hw3;

import java.util.Scanner;

public class Task3 {
    public static String getTime(int lesson) {
        int hours = 9;
        int minutes = 0;
        if (lesson != 0) {
            minutes += 45;
        }
        for (int i = 1; i < lesson; i++) {
            if (i % 2 == 0) {
                minutes += 15;
            } else {
                minutes += 5;
            }
            minutes += 45;
        }
        hours += minutes / 60;
        minutes = minutes % 60;
        String strHours = String.valueOf(hours);
        String strMinutes = String.valueOf(minutes);
        if (strHours.length() < 2) {
            strHours = "0" + strHours;
        }
        if (strMinutes.length() < 2) {
            strMinutes = "0" + strMinutes;
        }
        return strHours + ":" + strMinutes;
    }
}
