package obj;

// 本示例 将 展示 try_catch 的使用 ，找到会抛异常的代码 try{} 起来
public class TryCatch1 {
    public static void main(String[] args) {

        // 将你觉得会抛异常的代码 try{} 起来
        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]); // 比如这里就会发生错误，因为数组索引没有10
        } catch (Exception e) {
            // 与其他语言的区别 catch(Exception a) 需要在catch后跟上（）
            System.out.println("出现错误");
        } finally {
            // finally 语句允许你在 try_catch 结束后执行代码
            System.out.println(" 'try catch' 完成");
        }
    }

}
