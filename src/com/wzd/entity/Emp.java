package com.wzd.entity;

import java.util.Date;

/**
 * @author ：Administrator
 * @title :Emp
 * @projectName :Javabeandemo
 * @description：Emp实体类
 * @version: 1.0
 * @date ：Created in 2019/04/06/0006 8:36
 * @modified By：
 */
public class Emp {
    private int id;
    private String name;
    private double salary;
    private Date birthday;

    public Emp() {
    }

    public Emp(int id, String name, double salary, Date birthday) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }
}
