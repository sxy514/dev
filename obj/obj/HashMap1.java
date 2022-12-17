package obj;

// 本示例 展示 HashMap 的使用方法 
import java.util.HashMap;// 导入 HashMap 类

public class HashMap1 {
    public static void main(String[] args) {
        // 首先创建一个 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();

        // 添加 键值对 的语法 .put();
        Sites.put(1, "Google");
        Sites.put(2, "Bing");
        Sites.put(3, "Twitter");
        System.out.println(Sites);

        // 以下实例创建一个字符串（String）类型的 key 和字符串（String）类型的 value：
        // 语法为： HashMap<Key的类型,value的类型> 对象名 = new HashMap<Key的类型,value的类型>;
        HashMap<String, String> Text = new HashMap<String, String>();
        // 添加键值对
        Text.put("one", "Google");
        Text.put("two", "Baidu");
        Text.put("three", "BiliBili");
        Text.put("four", "Wechat");
        System.out.println(Text);

        // 我们可以使用 get(key) 方法来获取 key 对应的 value:
        System.out.println(Sites.get(3)); // 对象名.get(key名称);

        // 我们可以使用 remove(key) 方法来删除 key 对应的键值对(key-value):
        Sites.remove(1); // 删除 Sites 中的键值对 1
        System.out.println(Sites);

        // 删除所有键值对(key-value)可以使用 clear 方法：
        // Sites.clear();
        // System.out.println(Sites); // 删除后输出为空 {}

        // 如果要计算 HashMap 中的元素数量可以使用 .size() 方法：
        System.out.println(Text.size());

        // 迭代 HashMap 中的元素。如果你只想获取 key，可以使用 keySet() 方法
        // 然后可以通过 get(key) 获取对应的value，如果你只想获取 value，可以使用 values() 方法。
        // 输出 key 和 value
        for (Integer i : Sites.keySet()) {
            System.out.println("key: " + i + " value: " + Sites.get(i));
        }
        // 返回所有 value 值
        for (String value : Sites.values()) {
            // 输出只输出 value
            System.out.print(value + "\n");
        }
            // 只输出 key
        for (Integer i : Sites.keySet()) {
            System.out.println(i);
        }
    }

}