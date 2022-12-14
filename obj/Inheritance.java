package obj;

// 类继承 , 父类将属性和方法继承给子类 
// 如果不希望类被继承，使用 final 关键字
public class Inheritance {
    protected int x = 5; // protected 关键字 表示 受保护的

    public void inherMethod() {
        System.out.println("父类继承给子类的方法");
    }
}

// 子类 使用 extends 关键字 继承父类，就可以访问父类中的属性和方法啦
class SubClass extends Inheritance {
    public static void main(String[] args) {
        SubClass myObj = new SubClass();
        System.out.println(myObj.x);
        myObj.inherMethod();
    }
}
