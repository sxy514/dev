package obj;

class MyOutClass {
    int x = 1;

    class MyInnerClass { // 如果不希望访问内部类 使用 private 修饰符声明为 私有内部类
        int y = 2;

    }

    static class MyInnerClass2 { // 使用 static 修饰符可以 让内部类直接创建内部类对象
        int z = 5;
    }

}

public class InnerClasses {
    public static void main(String[] args) {

        // 创建一个外部类的对象
        MyOutClass myOutObj = new MyOutClass();
        System.out.println("这是外部类myOutClass的属性 x :" + myOutObj.x);

        // 访问内部类时 需要从外部类对象 new 一个 内部类的对象，就可以调用内部类的属性了

        // 创建内部类的对象语法： 外部类名.内部类名 对象名 = 外部对象.new 内部类名();

        MyOutClass.MyInnerClass myInObj = myOutObj.new MyInnerClass();
        System.out.println("这是内部类属性 y + 外部类属性 x 的和： " + (myInObj.y + myOutObj.x));

        // 当内部类 使用 static 修饰符时，可以直接创建内部类的对象
        // 访问内部类时候使用点： 外部类名 . 内部类名 即可
        MyOutClass.MyInnerClass2 myIn2Obj = new MyOutClass.MyInnerClass2();
        System.out.println("这是内部类MyInnerClass2的属性 z :" + myIn2Obj.z);
    }
}
