package obj;
public class Main {
    public static void main(String[] args) // Main类 下的 main 方法
    {
        // final int myNum = 15; //如果不希望别人覆盖现有的值 请使用 final关键字进行声明 这意味着不可更改和只读
        // myNum = 20; //声明为final后 不能更改 myNum
        // boolean b = true; //在JAVA使用布尔变量时 请输入全称 boolean
        // float a = 1.55f;
        // double c = 2.66d;
        // String d = "your name"; //使用String字符串时 首字母要大写
        // char e = 'a'; //快捷键 ctrl + shift + / 注释选中的内容 再次按下取消注释
        // String name = "eyeOS";
        // System.out.println("Hello world!");
        // System.out.println("who are you ?\n" + name);
        // System.out.println(myNum);
        int x = 6;
        int y = 10;
        System.out.println(x > y);
        if (x > y) // if语句
        {
            System.out.println(3 + 2);
        } else {
            System.out.println("条件不符合");
        }
        String result = (x < y) ? "good" : "bad"; // 简单的if else语句可缩写成这样 使用三元运算符 ？
        System.out.println(result);

        switch (x) // switch case语句
        {
            case 4:
                System.out.println("not");
                break;
            case 5:
                System.out.println("匹配成功");
                break;
            default:
                System.out.println("不在范围内");
        }
        // JAVA 数据类型，对应的数据必须存储到对应的数据类型
        // 例如已知一个数据为 122 ； 此时使用 byte （范围是 -128至127） 可以节省内存

        // while循环, 只要while()判断条件成立就一直执行{}内的代码，所以需要特殊条件来终止循环;
        while (x < y) {
            System.out.println("条件成立了" + x);
            x++; // x++ 每次执行完成后 x+1
        }
        // do while 循环 先执行一次do{}内的代码，然后在判断while（）的条件是否成立，成立就继续执行;
        int i = 0;
        do {
            System.out.println("do while循环执行了" + i);
            i++;
        } while (i < 5);

        // for循环语句 在知道循环次数时推荐使用 for 循环
        for (i = 5; i < 10; i++) {
            System.out.println("外for循环执行了" + (i - 4));
            for (int j = 1; j < 3; j++) // for循环可以内嵌
            {
                System.out.println("内部for循环" + j);
            }
        }

        // 还有一个 for-each 循环，专门用于遍历数组;
        String[] cars = { "Volvo", "BWM", "Ford" };
        for (String c : cars) {
            System.out.println(c); // 为什么这样就可以遍历数组？？
        }

        // 关键字 break 用来跳出当前循环;
        for (i = 0; i < 19; i++) {
            if (i == 4) {
                break;
            }
            System.out.println("i执行到了" + i);
        }
        // 关键子 continue 如果给出指定的条件，该语句将中断一次迭代（在循环中），并继续循环中的下一次迭代;
        for (i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
        // Java 数组，数组用于在单个变量中存储多个值，而不是为每个变量单独做声明，比如：
        String[] car = { "BWM", "Mazda" };
        int myNumber[] = { 3, 5, 7, 9 };
        // 访问数组中的元素如下：
        System.out.println(car[0]);
        myNumber[1] = 11; // 更改数组中的单个元素值
        System.out.println(myNumber[1]);

        // 循环遍历数组，如下操作
        int[] num = { 1, 2, 3, 45, 6 };
        for (i = 0; i < num.length; i++) {
            System.out.print(num[i]); // i 随循环改变，从0 开始; num.length获取了数组长度
        }
        // Java多维数组： 数组内的数组 {{},{}}
        int[][] num21 = { { 1, 2, 3 }, { 4, 5, 6 } }; // num21现在是由两个数组作为其元素的数组
        System.out.println(num21[0][0]); // num21[0][0]访问的是 0 位的数组{1.2.3}内的[0]，即为1
        // 调用方法如下
        myMethod();
        myMethod1("Java");
        System.out.println("myMethod2方法输出：" + myMethod2(x));
        System.out.println("调用重载myMethod2输出double x：" + myMethod2(0.0));
        int rt = myMethod2(5, 6);
        System.out.println("调用重载myMethod2输出两数和：" + rt);
        int result1 = sum(10);
        System.out.println("调用sum方法：" + result1);
    }

    // 创建一个方法: 方法是一个代码快，仅在调用时运行； 定义一次方法，可以重复使用;
    public static void myMethod() { // void关键字表示方法不接收返回值
        System.out.printf("调用myMethod方法输出：hello world\n");
    }

    // 方法的参数： 信息作为参数传递给方法，参数充当方法中的变量。参数在方法名称之后的括号内制定，可以添加多个参数，用分隔符隔开
    static void myMethod1(String fname) { // 添加 fname 参数，
        System.out.println(fname + " is Cool");
    }

    // 方法 返回值，上述的示例使用的 void 关键字不接收返回值，如果想要一个方法返回值，可使用原始数据类型代替
    static int myMethod2(int x) {
        return 22;
    }

    // 方法的重载： 使用方法重载时，多个方法可以具有相同的名称，但是具有不同的参数;
    static double myMethod2(double x) {
        return 2.2;
    }

    // 多个方法可以具有相同的名称，只要参数的数量和类型不同
    static int myMethod2(int z, int y) {
        return z + y;
    }

    // 方法作用域： 直接在方法中声明的变量在声明它们的代码之后的任何位置都可用;
    /*
     * public class Main {
     * public static void main(String[] args) {
     * // 这里的代码 不能使用 变量 x
     * int x = 100;
     * // 这里的代码 可以使用 变量 x
     * //{}外不能使用{}内的变量 y
     * {
     * //这里的代码 不能使用 变量y
     * int y = 100;
     * //这里的代码 可以使用 变量y
     * }
     * System.out.println(x);
     * }
     * }
     */
    // Java 递归：递归是函数调用自身的技术，这种技术提供了一种方法，将复杂的问题分解为更容易解决的简单问题;
    // 示例：将两个数字相加很容易，但将一系列数字相加会更复杂; 使用递归将其分解;
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    // Java 类/对象： 类就像一个对象构造函数，或者用于创建对象的 “蓝图”；
    // 在创建类时 ： 请使用关键字 class
    // 在Java语法中，类名应该始终以大写字母开头，并且.java文件的名称与类名匹配
    // 访问 com.obj 查看示例

    // Java 类属性示例中使用了术语“变量”（如下所示）。它实际上是类的一个属性。或者理解为类属性是类中的变量
    // 类属性的另一个术语是字段;
    public class Attributes {
        int x = 5; // 类属性
        int y = 3;
    }

    // 访问属性: 可以通过创建类的对象并使用 .属性名称 来访问对应属性;
    // Attributes myObj = new Attributes();
    // System.out.println(Attributes.x); //访问 类Attributes 的属性 x

    // 修改属性：可以修改属性值，比如：
    // myObj.x = 1; 可以修改对象的属性 x

    // Java 类方法

    Modifiers myOnb1 = new Modifiers();
}