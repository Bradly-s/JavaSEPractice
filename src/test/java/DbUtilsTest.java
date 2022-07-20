import jdbcutil.DbUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.*;
import pojo.CarGo;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

@Slf4j
public class DbUtilsTest {

    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass———————————————————————————————");
    }

    @Before
    public void before(){
        System.out.println("before———————————————————————————————");
    }

    @After
    public void after(){
        System.out.println("after———————————————————————————————");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass———————————————————————————————");
    }

    @Test
    public void testExecInsert() throws IOException {
        Connection connection = DbUtils.getMySqlConnection();
        String name = "小菜";
        String location = "货架666";
        String introduction = "新777";
////                增加
        String sqlAdd = "insert into cargo (name, location, introduction) values(?,?,?);";
        int add = DbUtils.exec(sqlAdd, connection, name, location, introduction);
        if(add > 0){
            log.info("增加成功！");
        }
    }

    @Test
    public void testExecDel() throws IOException {
        Connection connection = DbUtils.getMySqlConnection();
        String name = "小菜";
        String location = "货架666";
        String introduction = "新777";
        ////        删除
        String sqlDel = "delete from cargo where name = ? and location = ? ";
        int del = DbUtils.exec(sqlDel, connection, name, location);
        Assert.assertEquals("删除失败！", 1, del);
    }

    @Test
    public void testExecUpdate() throws IOException {
        Connection connection = DbUtils.getMySqlConnection();
        String name = "小菜";
        String location = "货架666";
        String introduction = "新777";
        ////        修改
        String sqlUpdate = "update cargo set introduction = ? where name = ? and location = ? ";
        int update = DbUtils.exec(sqlUpdate, connection,"呃呃呃呃呃", name, location);
    }

    @Test
    public void testGetAll() throws Exception {
        Connection connection = DbUtils.getMySqlConnection();
        Class clazz = CarGo.class;

        String sqlQuery = "select * from cargo";
        ArrayList<CarGo> arrayList = DbUtils.getAll(clazz, sqlQuery, connection);
        log.info(String.valueOf(arrayList.size()));
//        arrayList.forEach(System.out::println);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

}
