package obj;

// Java 修饰符
// 到目前 已经非常熟悉public关键字了，它的名字叫做访问修饰符
// public关键字是一个访问修饰符，这意味着它用于设置类、属性、方法和构造函数的访问级别。
// 我们把修饰语分为两类:

// 访问修饰符-控制访问级别,本示例展示访问修饰符

// 非访问修饰符-不控制访问级别，但提供其他功能

// 对于类，可使用 public 或者 不指定修饰符
// public关键字 创建的类可以被其他类访问（我可以在这个包外的其他类中访问到这里），不声明则这个类只能被同一个包中的类访问
public class Modifiers {
    // 对于属性、方法和构造函数，您可以使用以下方法之一
    // public: 所有类都可以访问该代码；
    // privare: 代码只能在声明的类中访问；
    // protected: 代码可以在相同的包或者子类中访问；
    // 默认：当你没有指定修饰符时，代码只能在同一个包中使用
    public void myPublicMethod() {
        System.out.println("这是公共方法，可以在所有类中创建对象后访问");
    }

    // privare: 代码只能在声明的类中访问；
    private static void myPrivateMethod() {
        System.out.println("这是私有方法，只能在声明的类中才能访问");
    }

    // 默认：当你没有指定修饰符时，代码只能在同一个包中使用
    void myDefaultMethod() {
        System.out.println("这是在Modifiers类中未指定修饰符的方法,只能在同一个包中访问,");
    }

    // protected: 代码可以在相同的包或者子类中访问；
    protected void myProtectedMethod() {
        System.out.println("这是受保护(protected)方法，在相同的包或者子类中访问");
    }

    public static void main(String[] args) {
        myPrivateMethod(); // static 关键字 声明的方法可直接调用
        Modifiers myObj = new Modifiers();
        myObj.myPublicMethod(); // 创建对象后调用 myPublicMethod 方法；
        myObj.myDefaultMethod();
        myObj.myProtectedMethod();

    }
}
