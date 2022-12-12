package obj;

// 本示例将展示 非访问修饰符
// 对于类，使用 final 和 abstract,如下：
// final ：该类不能被其他类继承
// abstract ： 表示该类是抽象类，不能用于创建对象（要访问抽象类中的属性和方法，只能将其继承给子类后才能访问）
abstract class Modifiers2 {
    int x = 5;

}

// final 表示该类不能被继承
final class Modifiers22 {
    int y = 10;
}

class Main extends Modifiers2 {

    // 要访问抽象类中的属性和方法，需要将抽象类 继承到子类中才能访问
    public static void main(String[] args) {
        Main myObj = new Main();

        System.out.println(myObj.x); // 创建对象后访问抽象类中的变量 x
    }

    // class Emain extends Modifiers22{} 无法继承，因为该类被 final 声明

}
