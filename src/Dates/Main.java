package Dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR,5);
        DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(dateFormat.format(calendar.getTime()));
        SimpleDateFormat sdf=new SimpleDateFormat("dd.....MM......yyyy");//date and time patterns
        System.out.println(sdf.format(calendar.getTime()));
    }
}
