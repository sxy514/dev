public class Main {
  // static void myMethod(String fname, int age) {
  //   System.out.println(fname + " is " + age);
  // }

  // static int myNum(int x) // 将void关键字进行替换，如果希望方法返回一个值，可使用原始数据类型进行替换  
  // {
  //   return x + 3;
  // }

  // public static void main(String[] args) {
  //   myMethod("Liam", 5);
  //   System.out.println(myNum(3));

// if else 来调用方法
    // static void checkAge(int x)
    // {
    //   if(x > 20)
    //   {
    //     System.out.println("sssssssssss");
    //   }else
    //   {
    //     System.out.println("进入");
    //   }
    // }
    //  public static void main(String[] args)
    //  {
    //   checkAge(30);   //调用chechAge() 
    //  }

     //方法重载：与其定义两个应该做同样事情的方法，不如重载一个
     static int myMethod(int x,int y)
     {
       return x +  y;
     }
     static double myMethod(Double x, double y)   //myMethod方法 分成了int 和 double 两种数据类型
     {
      return x + y;
     }
     static String myMethod(String nn)     //再次重载成String类型
     {
       return "This is myFristMeth";
     }
     public static void main(String[] args)
     {
       int myNum1 = myMethod(7, 1);
       double myNum2 = myMethod(2.2, 1.1);
       System.out.println(myNum1);
       System.out.println(myNum2);
       System.out.println(myMethod(null));
     }


}
    
 
