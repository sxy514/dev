package obj;

// 类的多态性
// 当一个父类被多个子类继承时，多态性就形成了
public class Polymorphism {
    static int x = 1;

    public void myMethod() {
        System.out.println("展示类继承的多态性");
    }
}

class ExPoly extends Polymorphism {
    public void myMethod() {
        System.out.println("子类的输出 ");
    }

}

class ExPoly1 extends Polymorphism {
    public static void main(String[] args) {

        // 创建自身的对象后调用从父类继承的方法，
        ExPoly1 myObj2 = new ExPoly1();
        myObj2.myMethod();

        // 分别调用其余类的对象
        Polymorphism myObj = new Polymorphism();
        ExPoly myObj1 = new ExPoly();
        myObj.myMethod();
        myObj1.myMethod();
    }

}