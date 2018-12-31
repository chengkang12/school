package com.lenovo.mt.model;

import java.io.Serializable;
import java.util.List;

public class Grade implements Serializable {
    private Integer id;

    private String name;

    private List<Classes> classes;

    public List<Classes> getClasses() {
        return classes;
    }

    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }

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
        this.name = name == null ? null : name.trim();
    }
}