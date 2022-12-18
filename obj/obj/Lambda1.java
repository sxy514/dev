package obj;

import java.util.ArrayList;

// 本示例展示 Lambda表达式 的使用 
public class Lambda1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        // Lambda表达式的语法 这将打印所有元素
        numbers.forEach((n) -> {
            System.out.println(n);
        });
        // 而这样打印的是 Array集合
        System.out.println(numbers);

    }

}
