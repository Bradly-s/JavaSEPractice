package stream;

import aggregate.AggregateOperation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {

    /**
    * Stream流的使用
    * */
    public static void streamUse(){
        ArrayList<String> list = new ArrayList<>();

        list.add("张三丰");
        list.add("李明");
        list.add("张一山");
        list.add("赵四");
        list.add("张丰");

        //Stream流
        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .filter(s -> s.contains("一"))
                .forEach(System.out::println);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

//        Stream流操作完毕的数据收集到List集合中并遍历
        Stream<String> listStream = list.stream().filter(s -> s.startsWith("张"))
                                    .filter(s -> s.length() == 3);
        List<String> names = listStream.collect(Collectors.toList());
        int i = 0;
        while (i < names.size()){
            System.out.println(names.get(i++));
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        //limit截取前指定参数个数的数据
        list.stream()
                .limit(3)
                .forEach(System.out::println);
        System.out.println("--------");

//        跳过指定参数个数的数据，返回由该流的剩余元素组成的流
        list.stream()
                .skip(3)
                .forEach(System.out::println);
        System.out.println("--------");
    }
    /**
     * Stream流的常见生成方式
     * */
    public static void generateWay() {
        //Collection体系的集合可以使用默认方法stream()生成流
        List<String> list = new ArrayList<String>();
        AggregateOperation.initList(list);
        Stream<String> listStream = list.stream();
//        listStream.forEach(System.out::println);
        System.out.println("*********************");

        Set<String> set = new HashSet<String>();
        Stream<String> setStream = set.stream();

        //Map体系的集合间接的生成流
        Map<String,String> map = new HashMap<String, String>();
        map.put("01","北京");
        map.put("02","上海");
        map.put("03","杭州");
        map.put("04","济南");
        map.put("05","深圳");
        Stream<String> keyStream = map.keySet().stream();
        Stream<String> valueStream = map.values().stream();
        Stream<Map.Entry<String, String>> entryStream = map.entrySet().stream();
//        entryStream.forEach(System.out::println);
        System.out.println("--------------------");

        //合并两个以上两个流
        Stream.concat(listStream, entryStream)
                .forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++");

        //数组可以通过Arrays中的静态方法stream生成流
        String[] strArray = {"2022年","7月","13日"};
        Stream<String> strArrayStream = Arrays.stream(strArray);
        strArrayStream.forEach(System.out::println);
        System.out.println("--------------------");

        //同种数据类型的多个数据可以通过Stream接口的静态方法of(T... values)生成流
        Stream<String> strArrayStream2 = Stream.of("2022年","7月","13日");
        Stream<Integer> intStream = Stream.of(12, 23, 34);
        intStream.forEach(System.out::println);
        System.out.println("--------------------");
    }


    public static void main(String[] args) {
        streamUse();

//        generateWay();

    }
}
