package Api;

import sun.java2d.cmm.lcms.LcmsServiceProvider;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTest2 {


    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("2015-02-05", DateTimeFormatter.ISO_DATE);
        LocalDate d2 = LocalDate.of(2015, 2, 5);
        LocalDate d3 = LocalDate.now();
        LocalDate d4 = LocalDate.parse("1989-12-31", DateTimeFormatter.ISO_DATE);
        LocalDate d5= LocalDate.of(1989,8,12);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
    }

}
