package obj;

//导入 java.io.File 可进行文件处理，该类有许多用于创建和获取信息的有用方法
import java.io.File;
import java.io.FileWriter; //导入 文件写入类
import java.io.IOException; // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

// 本示例展示 文件处理 ，创建，读取，更新和删除文件
// 创建文件
public class File1 {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        try {
            if (myObj.createNewFile()) {
                System.out.println("File creatd:" + myObj.getName());
            } else {
                System.out.println("文件已存在.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

// 在文件中写入内容
class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("努力学习!");
            // 请注意，完成对文件的写入后， 你应该关闭它
            myWriter.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

// 读取文件内容
class ReadFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt"); // 创建 File 类对象
            Scanner myReader = new Scanner(myObj); // 创建 Scanner 类对象 new Scanner(File类对象名);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();// 读取后放入 data 进行输出
                System.out.println(data);
            }
            myReader.close(); // 关闭读取
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

// 若要获取有关文件的详细信息，如下
class GetFileInfo {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}

// 删除文件如下
class DeleteFile {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}

// 也可以删除文件夹，但该文件夹必须为空
class DeleteFolder {
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\MyName\\Test"); // 在Windows环境下的路径
        if (myObj.delete()) {
            System.out.println("Deleted the folder: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }
}