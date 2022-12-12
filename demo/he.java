package demo;
//这里是笔记：作用域； 

public class he {
    // public static void main(String[] args)
    // {
    //     //
    //     //上方无法使用变量 x
    //     //System.out.println(x); 不能使用x变量
    //     int x = 5;
    //     //下方可以使用变量 x  
    //     System.out.println(x);
    //     //被{}包括的变量无法在{}外使用
    //     //{
    //     int y = 10;
    //     //}

    //     System.out.println(y);
    // }

    // 函数递归   什么是递归？  递归计算方法
    // public class Main {
    //     public static void main(String[] args) 
    //     {
    //       int result = sum(0);
    //       System.out.println(result);
    //     }
    //     public static int sum(int k)
    //     {
    //       if (k > 0)
    //       {
    //         return k + sum(k - 1);
    //       } 
    //       else
    //       {
    //         return 0;
    //       }
    //     }
    //   }

      //尝试定义一个递归函数  应该小心使用递归，错误的使用递归导致陷入无限循环，使用得当则非常高效
      public class Main {
        public static void main(String[] args)
        {
          int result = sum(1, 10);
          System.out.println(result);
        }
      }

        public static int sum(int start, int end) {
          if (end > start) {
            return end + sum(start, end - 1);
          } else {
            return end;
          }
        }


        
      }
 




