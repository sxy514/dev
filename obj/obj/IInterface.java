package obj;

// 实现抽象的另一种方法是使用 interface
// 由 interface 创建的类方法不包含主体，主体由 implements 类提供
interface Animal1 {
    public void animalSound(); // interface 类方法 不包含主体部分

    public void sleep1(); // interface method (does not have a body)
}

interface Cat {
    public void sound();

}

// Pig1 "implements" the Animal1 interface
// 接口关键字 interface 和 implements 实现
// 在Java中不能多重继承，一个子类只能继承一个父类，而接口则可以多个实现
// 就像这样，使用逗号分隔符将接口类分开即可
class Pig1 implements Animal1, Cat {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    public void sleep1() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }

    public void sound() {
        System.out.println("喵喵");
    }
}

class IInterface {
    public static void main(String[] args) {
        Pig1 myObj = new Pig1();
        myObj.animalSound();
        myObj.sleep1();
        myObj.sound();
    }
}
