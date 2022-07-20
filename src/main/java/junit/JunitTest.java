package junit;

import org.junit.Test;

//一般的话是创建main方法,执行main方法才能执行
public class JunitTest {
//    public static void main(String[] args) {
//        new JunitTest().add();
//    }
//    public static void add(){
//        int a=5;
//        int b=10;
//        System.out.println(a+b);
//    }

    //而增加@test之后，可以直接点击运行，也可以进行调试
    @Test
    public void add(){
        int a=5;
        int b=10;
        System.out.println(a+b);
    }
}



