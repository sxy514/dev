package obj;

import java.util.ArrayList;
import java.util.function.Consumer;

// 本示例展示 Lambda表达式 的使用 
public class Lambda1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        // Lambda表达式的语法 这将打印所有元素
        // (parameter1, parameter2) -> { code block }
        numbers.forEach((n) -> {
            System.out.println(n);
        });
        // 而这样打印的是 Array集合
        System.out.println(numbers);
    }
}

// 如果变量的类型是只有一个方法的接口，Lambda表达式可以存储在变量中
class Lambda2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(33);
        numbers.add(23);
        numbers.add(55);
        // 使用 Java 的接口将 lambda 表达式存储在变量中
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        numbers.forEach(method);
    }
}

// 要在方法中使用lambda表达式，方法应该有一个参数，其类型为单一方法接口。调用接口的方法将运行lambda表达式
// 创建一个以lambda表达式为参数的方法:
interface StringFunction {
    String run(String str);
}

class Lambda3 {

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str); // ？？
        System.out.println(result);
    }

    public static void main(String[] args) {
        StringFunction exclaim = (a) -> a + "!"; // Lambda表达式为参数
        StringFunction ask = (a) -> a + "?";

        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

}