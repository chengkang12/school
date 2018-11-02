package com.lenovo.mt.model;

public class Classes {
    private Integer id;

    private String clsname;

    private Integer grade;

    private Grade gradeDetail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClsname() {
        return clsname;
    }

    public void setClsname(String clsname) {
        this.clsname = clsname == null ? null : clsname.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Grade getGradeDetail() {
        return gradeDetail;
    }

    public void setGradeDetail(Grade gradeDetail) {
        this.gradeDetail = gradeDetail;
    }
}