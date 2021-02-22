package work.finsbug.icode.demo;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @description 测试
 * @author fins
 * @date 2021/2/22
 **/
public class CalendarDemo {

    public static void main(String[] args) {


        System.out.println(getFirstOfWeek(new Date(1614322424000L)));
    }

    public static Long getFirstOfWeek(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        System.out.println("time:" + cal.getTimeInMillis());
        System.out.println("day of month:" + cal.get(Calendar.DAY_OF_MONTH));
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
        System.out.println("day of month:" + cal.get(Calendar.DAY_OF_MONTH));
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 0,0,0);
        Date first=cal.getTime();
        System.out.println("time:" + cal.getTimeInMillis());
        return cal.getTimeInMillis();
    }
}
