package obj;

// 使用线程 可同时执行 多个任务
// 本示例展示两种创建线程的方法：1.继承 Thread类 实现 :
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

// 2.使用接口 Runnable 实现多线程, 实现接口的关键字 为 implements
class RunnableDemo implements Runnable {
  private Thread t;
  private String threadName;

  RunnableDemo(String name) {
    threadName = name;
    System.out.println("Creating " + threadName);
  }

  public void run() {
    System.out.println("Running " + threadName);
    try {
      for (int i = 3; i > 0; i--) {
        System.out.println("Thread: " + threadName + ", " + i);
        // 让线程睡眠一会
        Thread.sleep(50);
      }
    } catch (InterruptedException e) {
      System.out.println("Thread " + threadName + " interrupted.");
    }
    System.out.println("Thread " + threadName + " exiting.");
  }

  public void start() {
    System.out.println("Starting " + threadName);
    if (t == null) {
      t = new Thread(this, threadName);
      t.start();
    }
  }
}

class TestThread {
  public static void main(String args[]) {
    RunnableDemo R1 = new RunnableDemo("Thread-1");
    R1.start();

    RunnableDemo R2 = new RunnableDemo("Thread-2");
    R2.start();
  }
}

// 如果类实现接口，则可以通过传递 类的实例 obj 到对象的构造函数，然后调用线程的方法
// 由于线程与程序的其他部分同时运行，因此无法 知道代码将以哪种顺序运行。
final class Main1 implements Runnable {
  public static void main(String[] args) {
    Main1 obj = new Main1();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("这段代码在线程之外");
    for (int i = 0; i < 5; i++) {
      System.out.println("线程外运行了：" + i);
    }
  }

  public void run() {
    System.out.println("这段代码运行在一个线程上");
    for (int i = 0; i < 5; i++) {
      System.out.println("线程内运行了：" + i);
    }
  }
}

// 当线程和主程序正在读取 并写入相同的变量，这些值是不可预测的。由此产生的问题 由此称为并发问题。
// 为了避免并发性问题，最好在线程之间共享尽可能少的属性。如果需要共享属性，一种可能的解决方案是在使用线程可以更改的任何属性之前，
// 使用线程的方法 isAlive()来检查线程是否已经完成运行。
final class Main2 extends Thread {
  public static int amount = 0;

  public static void main(String[] args) {
    Main2 thread = new Main2();
    thread.start();
    // 等待线程完成，线程未结束则 thread.isAlive 一直为 true
    while (thread.isAlive()) {
      System.out.println("Waiting...");
    }
    // 等待线程结束后 amount 的值变为 1 输出
    System.out.println("Main: " + amount);
    amount++;
    System.out.println("Main: " + amount);
    amount++;
    System.out.println("Main: " + amount);
  }

  public void run() {
    amount++;
  }
}