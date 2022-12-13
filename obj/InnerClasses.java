package obj;

class myOutClass {
    int x = 1;

    class MyInnerClass {
        int y = 2;

    }

}

public class InnerClasses {
    public static void main(String[] args) {

        // 创建一个外部类的对象
        myOutClass myOutObj = new myOutClass();
        System.out.println("这是外部类myOutClass的属性 x :" + myOutObj.x);

        // 访问内部类时 需要从外部类对象 new 一个 内部类的对象，就可以调用内部类的属性了
        // 外部类名.内部类名 对象名 = 外部对象.new 内部类名();

        myOutClass.MyInnerClass myInObj = myOutObj.new MyInnerClass();
        System.out.println(myInObj.y + myOutObj.x);

    }
}
