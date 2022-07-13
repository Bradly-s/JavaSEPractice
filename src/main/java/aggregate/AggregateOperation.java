package aggregate;

import java.util.*;

public class AggregateOperation {

    //    初始化集合
    public static void initCollection(Collection<String> collection){
        //添加元素
        collection.add("北京");
        collection.add("上海");
        collection.add("深圳");
        collection.add("杭州");
        collection.add("济南");
    }

    //    遍历集合-迭代器
    public static void listCollection(Collection<String> collection){
        //Iterator<E> iterator()：返回此集合中元素的迭代器，通过集合的iterator()方法得到
        Iterator<String> iterator = collection.iterator();

        //用while循环改进元素的判断和获取
        while (iterator.hasNext()) {
            String city = iterator.next();
            System.out.println(city);
        }
        System.out.println("----------------------------------");
    }

    //    遍历集合-增强for
    public static void listCollectionUpFor(Collection<String> collection){
//        增强for
        for(String str : collection){
            System.out.println(str);
        }
        System.out.println("----------------------------------");
    }

    //        初始化集合
    public static void initList(List<String> stringList){
        //添加元素
        stringList.add("北京");
        stringList.add("上海");
        stringList.add("深圳");
        stringList.add("杭州");
        stringList.add("济南");
    }

    //    遍历集合-迭代器
    public static void listList(List<String> stringList){
        //Iterator<E> iterator()：返回此集合中元素的迭代器，通过集合的iterator()方法得到
        Iterator<String> iterator = stringList.iterator();

        //用while循环改进元素的判断和获取
        while (iterator.hasNext()) {
            String city = iterator.next();
            System.out.println(city);
        }
        System.out.println("----------------------------------");
    }

    //    遍历集合-增强for
    public static void listListUpFor(List<String> stringList){
//        增强for
        for(String str : stringList){
            System.out.println(str);
        }
        System.out.println("----------------------------------");
    }



    //        初始化集合
    public static void initSet(Set<String> set){
        //添加元素
        set.add("北京");
        set.add("上海");
        set.add("深圳");
        set.add("杭州");
        set.add("济南");
    }

    //    遍历集合-迭代器
    public static void listSet(Set<String> set){
        //Iterator<E> iterator()：返回此集合中元素的迭代器，通过集合的iterator()方法得到
        Iterator<String> iterator = set.iterator();

        //用while循环改进元素的判断和获取
        while (iterator.hasNext()) {
            String city = iterator.next();
            System.out.println(city);
        }
        System.out.println("----------------------------------");
    }

    //    遍历集合-增强for
    public static void listSetUpFor(Set<String> set){
//        增强for
        for(String str : set){
            System.out.println(str);
        }
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        /**
         * Collection集合
         * */
//        //创建集合对象
//        Collection<String> collection = new ArrayList<>();
//        //初始化集合
//        initCollection(collection);
////        遍历集合-迭代器
//        listCollection(collection);
//
////        迭代器中删除
//        collection.removeIf("上海"::equals);
////        遍历集合-增强for
//        listCollectionUpFor(collection);


        /**
         * List集合
         * */
//        //创建集合对象
//        List<String> stringList = new ArrayList<>();
//        //初始化集合
//        initList(stringList);
////        遍历集合-迭代器
//        listList(stringList);
//
////        迭代器中删除
//        stringList.removeIf("上海"::equals);
////        遍历集合-增强for
//        listListUpFor(stringList);


        /**
         * Set集合
         * */
//        //创建集合对象
//        Set<String> set = new TreeSet<>();
//        //初始化集合
//        initSet(set);
////        遍历集合-迭代器
//        listSet(set);
//
////        迭代器中删除
//        set.removeIf("上海"::equals);
////        遍历集合-增强for
//        listSetUpFor(set);


        /**
         * Map集合
         * */
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();

        map.put("01","北京");
        map.put("02","上海");
        map.put("03","杭州");
        map.put("04","济南");
        map.put("05","深圳");

        //输出集合对象
        System.out.println(map);

        //根据键删除键值对元素
        System.out.println(map.remove("05"));

        //判断集合是否包含指定的键
        System.out.println(map.containsKey("05"));

        //判断集合是否为空
        System.out.println(map.isEmpty());

        //集合的长度，也就是集合中键值对的个数
        System.out.println(map.size());

        //根据键获取值
        System.out.println(map.get("04"));
        System.out.println(map.get("03"));

//        获取所有键的集合
        Set<String> keySet = map.keySet();
        for(String key : keySet) {
            System.out.println(key);
        }

        //获取所有值的集合
        Collection<String> values = map.values();
        for(String value : values) {
            System.out.println(value);
        }
    }
}
