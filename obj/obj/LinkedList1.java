package obj;

// 本示例展示 一个简单的链表
// 导入 LinkedList 类 
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        // 创建链表 的语法如下
        LinkedList<String> sites = new LinkedList<String>();
        // 使用 add 添加元素
        sites.add("Goole");
        sites.add("Bing");
        sites.add("Baidu");

        // 更多的情况下我们使用 ArrayList 访问列表中的随机元素更加高效，但以下几种情况 LinkedList 提供了更高效的方法。在列表开头添加元素：
        sites.addFirst("Wiki"); // 添加头部元素
        sites.addLast("Twitter");// 添加尾部元素
        sites.removeFirst(); // 移除链表中的第一个元素Wiki
        System.out.println(sites);
        System.out.println(sites.getFirst()); // 使用 getFirst() 获取头部元素
        // 与 ArrayList 一样 可使用for循环来迭代列表元素
        for (int size = sites.size(), i = 0; i < size; i++) {
            System.out.println(sites.get(i));
        }
        // 也可以使用 for-each 来迭代元素
        for (String i : sites) {
            System.out.println(i);
        }

    }

}
