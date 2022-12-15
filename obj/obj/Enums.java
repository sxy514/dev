package obj;

// 在类中创建枚举请使用 enum 关键字，枚举表示一组常量
public class Enums {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    // 枚举通常用于搭配switch语句来case相应的值时

    public static void main(String[] args) {
        // 注意是如何访问枚举类中的常量的
        // Level myVar = Level.MEDIUM;
        Level myVar2 = Level.HIGH;
        System.out.println(myVar2);

        // 枚举通常用于搭配switch语句来case相应的值时
        switch (myVar2) {
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
        }

        // 循环遍历枚举，枚举类型有一个方法 .values() 专门用于遍历enum
        // for(枚举名 变量名 ： 枚举名.values()){
        // 输出变量名
        // }
        for (Level myVar21 : Level.values()) {
            System.out.println(myVar21);
        }

    }
}
