package obj;

public class Obj1 {
    // static 关键字 创建的方法无需创建对象即可调用
    static void myMethod() {
        System.out.println("Hello World!");
    }

    // public 关键字 创建的方法需要创建对象后才能调用
    public void myMethod1() {
        System.out.println("这是 public 方法，需要创建对象才能调用");
    }

    public static void main(String[] args) {
        myMethod(); // 可以直接调用 static 方法

        // 同一个包中的类可以访问
        Modifiers myObj2 = new Modifiers();

        // 不能直接调用公共方法,需要创建对象
        Obj1 myObj = new Obj1();
        myObj.myMethod1();
    }

}
