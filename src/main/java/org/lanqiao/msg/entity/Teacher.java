package org.lanqiao.msg.entity;

import java.util.Set;

public class Teacher {
    private Integer id;

    private String name;

    public Set<Classes> getClasses() {
        return classes;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classes=" + classes +
                '}';
    }

    public void setClasses(Set<Classes> classes) {
        this.classes = classes;
    }

    private Set<Classes> classes;



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