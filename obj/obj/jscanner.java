package obj;

import java.util.Scanner;

// 本示例展示导入Scanner类来获取用户输入 
public class jscanner {
    public static void main(String[] args) {
        // 导入Scanner类后创建它的对象
        Scanner myObj = new Scanner(System.in); // 在 new 时 添加参数 System,in
        System.out.println("请输入信息：");

        String text = myObj.nextLine(); // 调用 Scanner 对象的 方法 nextLine 接收输入
        System.out.println("这是你输入的信息:\n" + text);
    }
}
