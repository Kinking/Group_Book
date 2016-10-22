package com.example.huangzhiyuan.group_book;

/**
 * Created by huangzhiyuan on 16/7/29.
 */
public class MemberBean {
    int iconId;
    String name;
    String tel;
    String qqNum;

    public MemberBean(int iconId, String name, String qqNum, String tel) {
        this.iconId = iconId;
        this.name = name;
        this.qqNum = qqNum;
        this.tel = tel;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQqNum() {
        return qqNum;
    }

    public void setQqNum(String qqNum) {
        this.qqNum = qqNum;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
