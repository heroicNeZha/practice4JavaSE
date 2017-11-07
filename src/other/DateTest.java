package other;

import javax.jws.soap.SOAPBinding;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/11/4.
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        testDateDemo1(date);
        testSimpleDateFormatDemo(date);

    }

    private static void testSimpleDateFormatDemo(Date date) {
        SimpleDateFormat simpleDateFormat0=new SimpleDateFormat("Gyyyy年MM月dd日 HH时mm分ss秒");
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("yyyy/MM/dd HH:mm");
        SimpleDateFormat simpleDateFormat2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat simpleDateFormat3=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 E ");
        SimpleDateFormat simpleDateFormat4=new SimpleDateFormat("yyyy/MM/dd E");
        SimpleDateFormat simpleDateFormat5=new SimpleDateFormat("一年中的第 D 天 ，第w个星期 ，一个月中第W个星期 ，k时 z时区");

        String string_date6 = simpleDateFormat0.format(date);
        String string_date7 = simpleDateFormat1.format(date);
        String string_date8 = simpleDateFormat2.format(date);
        String string_date9 = simpleDateFormat3.format(date);
        String string_date10 = simpleDateFormat4.format(date);
        String string_date11 = simpleDateFormat5.format(date);

        System.out.println(string_date6);
        System.out.println(string_date7);
        System.out.println(string_date8);
        System.out.println(string_date9);
        System.out.println(string_date10);
        System.out.println(string_date11);
    }

    private static void testDateDemo1(Date date) {
        DateFormat dateFormat1 = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
        DateFormat dateFormat2 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        DateFormat dateFormat3 = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        DateFormat dateFormat4 = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
        DateFormat dateFormat5 = DateFormat.getDateInstance();
        String string_date1 = dateFormat1.format(date);
        String string_date2 = dateFormat2.format(date);
        String string_date3 = dateFormat3.format(date);
        String string_date4 = dateFormat4.format(date);
        String string_date5 = dateFormat5.format(date);
        System.out.println("当前时间:"+date);
        System.out.println("当前时间(.getDateTimeInstance short):"+string_date1);
        System.out.println("当前时间(.getDateTimeInstance medium):"+string_date2);
        System.out.println("当前时间(.getDateTimeInstance long):"+string_date3);
        System.out.println("当前时间(.getDateTimeInstance full):"+string_date4);
        System.out.println("当前时间(.getDateInstance):"+string_date5);
    }
}
