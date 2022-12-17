package obj;

import java.util.ArrayList;
// 使用 Iterator 前需导入
import java.util.Iterator;

// 本示例 将展示 Iterator（迭代器） 
public class Iterator1 {
    public static void main(String[] args) {
        // 创建任意一个集合
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");

        // 获取迭代器, 注意语法
        Iterator<String> it = sites.iterator();

        // 输出集合中的第一个元素
        System.out.println(it.next());

        // 让迭代器 it 逐个返回集合中所有元素最简单的方法是使用 while 循环
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 删除元素，要删除集合中的元素可以使用 remove() 方法。
        // 创建一个整型 ArrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it1 = numbers.iterator();

        // 这将删除小于 10 的元素
        // it1.hasNext() 是判断条件，当迭代器中有更多元素时返回 true，while开始循环
        while (it1.hasNext()) {
            Integer i = it1.next();
            if (i < 10) {
                it1.remove();
            }
        }
        System.out.println(numbers); // 这个示例展示 筛选集合中的元素

    }

}
