package obj;

//本示例为构造函数
class Constructors {
    int x = 5;
    int y = 1;

    // 创建构造函数如下， 用 public 类名（）创建构造函数
    // 构造函数也可以加参数，参数传递给类属性完成初始化
    public Constructors(int input) {
        x = 0;
        y = input;
    }

    public static void main(String[] args) {
        Constructors myObj = new Constructors(5); // 在创建对象时为参数赋值
        System.out.println(myObj.x);
        System.out.println(myObj.y);
    }
}
