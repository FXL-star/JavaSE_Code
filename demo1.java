package dateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class demo1 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);

    }
}
