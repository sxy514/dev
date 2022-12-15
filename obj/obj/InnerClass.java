package obj;

// 内部类示例
// 嵌套类的目的是将属于一起的类分组，从而使代码更具可读性和可维护性。
// 要访问内部类，创建一个外部类的对象，然后创建一个内部类的对象
class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

public class InnerClass {
    public static void main(String[] args) {

        // 本示例主要展示创建 内部类 的语句 首先创建一个外部类的对象
        OuterClass myOutObj = new OuterClass();

        // 外部类名.内部类名 对象名 = 外部对象名.new 内部对象名();
        OuterClass.InnerClass myInObj = myOutObj.new InnerClass();

        System.out.println("这是内部类对象的属性 y : " + myInObj.y);
    }
}
