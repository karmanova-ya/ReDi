package exercise2;

import org.apache.commons.lang3.time.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ChangeDate {

    public static void main(String[] args) {
        Date today = new Date();
        int addDays = 5;
        SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Today is " + dt.format(today));
        System.out.println("In " + addDays + " days it will be " + dt.format(DateUtils.addDays(today, addDays)));
    }
}
