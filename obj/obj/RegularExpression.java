package obj;

// 导入 Pattern类 - 定义模式（在搜索中使用）
import java.util.regex.Matcher;
// 导入 Matcher类 - 用于搜索 模式
import java.util.regex.Pattern;

// 本示例展示 正则表达式 的用法  
public class RegularExpression {

    public static void main(String[] args) {

        // 注意用法，当匹配到 名字 后 输出 match found
        Pattern pattern = Pattern.compile("sixieyou", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("my name is sixieyou");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
