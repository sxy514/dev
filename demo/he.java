package demo;
//这里是笔记：作用域； 

public class he {
    public static void main(String[] args)
    {
        //
        //上方无法使用变量 x
        //System.out.println(x); 不能使用x变量
        int x = 5;
        //下方可以使用变量 x  
        System.out.println(x);
        //被{}包括的变量无法在{}外使用
        //{
        int y = 10;
        //}

        System.out.println(y);
    }

    // 函数递归   什么是递归？  递归计算方法
    public class Main {
        public static void main(String[] args) 
        {
          int result = sum(10);
          System.out.println(result);
        }
        public static int sum(int k)
        {
          if (k > 0)
          {
            return k + sum(k - 1);
          } 
          else
          {
            return 0;
          }
        }
      }

}
