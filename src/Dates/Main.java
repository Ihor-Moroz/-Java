package Dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Date date=new Date();
        System.out.println(date);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR,5);
        DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(dateFormat.format(calendar.getTime()));
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm");//date and time patterns
        System.out.println(sdf.format(calendar.getTime()));
        Date newDate= sdf.parse("23:52");
        System.out.println(newDate);
    }
}
