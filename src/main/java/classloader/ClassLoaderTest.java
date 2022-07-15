package classloader;

public class ClassLoaderTest {

    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println("系统类加载器：" + classLoader);

        //获取系统类加载器父级加载器--扩展类加载器
        ClassLoader parent = classLoader.getParent();
        System.out.println("系统类加载器父类--扩展类加载器：" + parent);

//        获取扩展类加载器的父级加载器:引导类加载器 (根类加载器)
        //引导类加载器因为通常是C/C++编写的 Java获取不到 所以这里打印的是一个null
        ClassLoader parent1 = parent.getParent();
        System.out.println("根类加载器：" + parent1);

        //测试当前类是由哪个类加载器加载
//        Class.forName("包名+类名")
        ClassLoader classLoader1 = Class.forName("classloader.ClassLoaderTest").getClassLoader();
//        ClassLoader classLoader1 = ClassLoaderTest.class.getClassLoader();
        System.out.println("当前类的类加载器：" + classLoader1);

    }
}

