package obj;

// 使用线程 可同时执行 多个任务
// 本示例展示两种创建线程的方法：1.继承实现 2.使用接口
public class Thread22 extends Thread {
  public static void main(String[] args) {
    Thread22 thread = new Thread22();
    thread.start();
    System.out.println("This code is outside of the thread");
  }

  public void run() {
    System.out.println("This code is running in a thread");
  }
}
