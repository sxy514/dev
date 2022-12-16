package obj;

import java.time.LocalDate; // 导入的类用于显示日期
import java.time.LocalTime; // 导入一个类显示当前时间
import java.time.LocalDateTime; // 导入一个日期和时间类，可以显示日期与时间
import java.time.format.DateTimeFormatter; //导入该类用于设置时间的格式

public class DateTime {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); // 创建一个LocalDate类对象
        System.out.println(myObj); // 显示当前日期

        LocalTime myObj1 = LocalTime.now(); // 创建一个LocalTime类对象
        System.out.println(myObj1); // 显示当前时间

        LocalDateTime myObj2 = LocalDateTime.now(); // 创建日期和时间类对象，注意写法
        System.out.println("修改前的格式" + myObj2); // 显示当前日期与时间

        // 修改日期时间显示的格式
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myObj2.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}