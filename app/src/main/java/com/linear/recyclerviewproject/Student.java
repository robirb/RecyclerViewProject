package com.linear.recyclerviewproject;

import java.io.Serializable;

/**
 * Created by IMAT PC-01 on 9/16/2017.
 */

public class Student implements Serializable {
    private String name;
    private String className;
    private String roll;

    public Student() {
    }

    public Student(String name, String className, String roll) {
        this.name = name;
        this.className = className;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
}
