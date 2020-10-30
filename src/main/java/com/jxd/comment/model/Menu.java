package com.jxd.comment.model;

/**
 * @ClassName Menu
 * @Description TODO
 * @Author GengYang
 * @Date 2020/10/29
 * @Version 1.0
 */

public class Menu {
    private int id;
    private String path;//前台路径
    private String name;//
    private String nameZh;//对应的导航名
    private String iconCls;//导航图标名
    private String component;//vue组件名
    private String parnetId;//父组件id

    public Menu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getParnetId() {
        return parnetId;
    }

    public void setParnetId(String parnetId) {
        this.parnetId = parnetId;
    }
}
