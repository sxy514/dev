package obj;

//导入包 java.util.ArrayList 用于创建数组表
import java.util.ArrayList;

// 本示例展示数组列表的使用方法
public class ArrayList1 {
    public static void main(String[] args) {

        // 创建数组列表的语法如下： ArrayList<String> 数组名 = new ArrayList<String>();
        ArrayList<String> cars = new ArrayList<String>();

        // 使用 数组名.add(); 添加数组中的元素
        cars.add("沃尔沃");
        cars.add("BWM");
        cars.add("Ford");
        System.out.println(cars);

        // 要访问数组中的任意元素，使用 .get(索引号)
        System.out.println(cars.get(0));

        // 若要单独修改一个元素，使用 .set(索引号);
        cars.set(0, "12");
        System.out.println(cars);

        // 若要找出 ArrayList 有多少个元素，请使用 .size();
        System.out.println(cars.size());

        // 若要删除元素，请使用方法 .remove();
        cars.remove(0);
        System.out.println(cars);

        // 要删除数组列表中的所有元素，请使用方法 clear();
        cars.clear();
        System.out.println(cars);

        // 循环遍历循环的元素，使用该方法指定循环应运行的次数：
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // 还可以循环使用 for-each 循环：ArrayList
        for (String i : cars) {
            System.out.println(i);
        }

    }
}
