package obj; //如左侧关键字 package ，使用用户自定义的包

import java.util.Scanner; // 导入单个类 Scanner 用于获取用户输入

// 导入后就可以使用 Scanner 类了
public class PackageAPI {
    public static void main(String[] args) {
        // 创建一个 Scanner 类的对象
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = myObj.nextLine(); // 调用对象的方法 获取用户输入后 将其赋值给字符串变量 userName
        System.out.println("Username is: " + userName);
    }
}
