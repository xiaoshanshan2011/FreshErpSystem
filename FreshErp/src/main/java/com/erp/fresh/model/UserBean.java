package com.erp.fresh.model;

import java.util.List;

/**
 * Created by 陈俊山 on 16-12-18.
 */
public class UserBean {
    private int uid;
    private String msg;
    private String headImg;
    private String title;
    private String address;
    private boolean islive;
    private List<Person> list;

    public UserBean(int uid, String msg, String headImg, String title, String address, boolean islive, List<Person> list) {
        this.uid = uid;
        this.msg = msg;
        this.headImg = headImg;
        this.title = title;
        this.address = address;
        this.islive = islive;
        this.list = list;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isIslive() {
        return islive;
    }

    public void setIslive(boolean islive) {
        this.islive = islive;
    }

    public List<Person> getList() {
        return list;
    }

    public void setList(List<Person> list) {
        this.list = list;
    }

    public static class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
