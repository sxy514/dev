package obj;

// 使用HashSet前需要导入
import java.util.HashSet;

// HashSet 的特点就是集合中不允许重复的元素 
public class HashSet1 {
    public static void main(String[] args) {
        // 创建一个 HashSet 对象 cars , 语法如下
        HashSet<String> cars = new HashSet<String>();
        cars.add("BWM");
        cars.add("Ford");
        cars.add("Volvo");
        cars.add("Volvo"); // HashSet 的特点就是 集合中的每个元素都是唯一的，所以这里添加无效
        System.out.println(cars);

        // 判断元素是否存在： 使用 contains() 方法
        // 如果存在则返回一个布尔值 true / false
        System.out.println(cars.contains("BWM"));

        // 删除元素使用: remove() 方法
        cars.remove("BWM");
        System.out.println(cars);

        // 计算大小用 size() 方法 ； 删除集合中所有元素使用 clear() 方法 ； 迭代使用 for循环，都很类似
        for (String i : cars) {
            System.out.println(i);
        }

    }
}
