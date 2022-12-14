package obj;

//本示例将展示封装
// 封装更好的控制类属性和方法
// 类属性可以设置为 只读get 和 只写set，更灵活，可只修改代码的一部分

class Example {
    private String name = "xieyou"; // 封装一个 字符串变量 name

    // 创建一个 公共get 的方法
    public String getName() {
        return name;
    }

    // 创建一个 公共set 的方法
    // 请注意 setName 的写法
    public void setName(String newName) { // 将参数 newName 传递给 封装变量
        this.name = newName;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        // 创建一个 示例类 的对象
        Example myObj = new Example();
        // 创建一个对象后 可以调用 setName 方法 对封装变量 name 进行修改
        myObj.setName("Setnull");
        // 再调用 getName 方法 获取 name
        System.out.println(myObj.getName());

    }

}
