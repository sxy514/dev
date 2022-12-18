package obj;

import java.util.Scanner;

// 本示例展示导入Scanner类来获取用户输入 
public class Jscanner {
    public static void main(String[] args) {
        try (// 导入Scanner类后创建它的对象
        Scanner myObj = new Scanner(System.in)) {
            System.out.println("请输入信息：");

            // 调用 Scanner 对象的 方法 nextLine 接收字符串输入
            String text = myObj.nextLine(); // 方法 .next 可以接收其他数据类型
            // 例如： myObj.nextBoolean() 接收布尔类型 myObj.nextInt() 接收整型类型
            System.out.println("这是你输入的信息:\n" + text);

            int age = myObj.nextInt(); // 接收用户输入的整型变量
            double salary = myObj.nextDouble(); // 接收用户输入的double类型变量 ，若用户输入的类型不匹配将会抛异常
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        }

    }
}
