package obj;

// 抽象类的示例  
// 使用关键字 abstract 将类声明为抽象类， 抽象类只能被子类继承后才能调用它的属性和方法 

abstract class Animal {
    // 抽象类不能用于创建对象，只能被继承给子类后才能创建子类对象调用抽象类中的属性和方法

    public abstract void animalSound(); // 由 abstract 声明的抽象方法，主体将在子类中提供

    public void Sleep() {
        System.out.println("Zzz");
    }
}

// 在继承抽象类时，若抽象类中存在抽象方法，需在子类中创建抽象方法的 body
class Pig extends Animal {

    // 在继承抽象类的抽象方法 animalSound 后 需要对抽象方法提供 body
    public void animalSound() {
        System.out.println("The pig says : wee wee");
    }
}

public class Abstract {
    public static void main(String[] args) {
        // 然后创建 抽象父类的子类对象 并调用其方法
        Pig myPigObj = new Pig();
        // 输出 myPigObj 中的 animalSound 方法 ， 该方法在抽象父类中创建，在子类中提供 body
        myPigObj.animalSound(); 
        myPigObj.Sleep(); //
    }
}
