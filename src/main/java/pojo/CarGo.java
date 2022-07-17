package pojo;

import java.io.Serializable;

/**
 * 货物类
 * */
public class CarGo implements Serializable {
    // id 主键
    private Integer id;
    // 名称
    private String name;
    // 位置
    private String location;
    // 描述
    private String introduction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
