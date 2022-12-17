package obj;

// 本示例展示 包装类 
public class WrapperClasses1 {
    public static void main(String[] args) {

        // 使用 int 的包装类 Integer 创建 对象 myInt
        Integer myInt = 5;
        Double myDouble = 5.99; // 创建包装器对象
        Character myChar = 'A';
        System.out.println(myInt + 5); // 打印对象可获取该值
        System.out.println(myInt.intValue() + 5); // 使用的包装器方法获取 .intValue() ，输出结果一致
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
        // 使用方法 .toString() 可将Int 转换成 String
        String myString = myInt.toString();
        // 使用 .length() 获取字符串长度 
        System.out.println(myString.length());

    }
}
