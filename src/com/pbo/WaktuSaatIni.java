package com.pbo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * #Author
 * Name  : Agung Sepruloh
 * Class : IF-11K
 * NIM   : 10118902
 * Program description: this program will shows the current day, date and time
 *
 */

public class WaktuSaatIni {

    public static String getFullDate(){
        DateFormat dateformat = new SimpleDateFormat("dd MMM yyyy H:mm:s");
        Date date = new Date();
        return dateformat.format(date);
    }

    public static String getDay(){
        DateFormat dateformat = new SimpleDateFormat("EEEEEE");
        Date date = new Date();
        String day = dateformat.format(date);
        String[] idn_day = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        String[] en_day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < 7; i++) {
            if (day.equals(en_day[i])) {
                day = idn_day[i];
            }
        }
        return day;
    }

    public static void main(String[] args) {
        System.out.println(String.format("Hari ini adalah hari: %s, %s", getDay(), getFullDate()));
    }
}