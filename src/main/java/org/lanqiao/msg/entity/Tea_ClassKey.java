package org.lanqiao.msg.entity;

import java.util.Set;

public class Tea_ClassKey {
    private Integer class_id;

    public Set<Teacher> getTeacherSet() {
        return teacherSet;
    }

    public void setTeacherSet(Set<Teacher> teacherSet) {
        this.teacherSet = teacherSet;
    }

    public Set<Classes> getClassesSet() {
        return classesSet;
    }

    public void setClassesSet(Set<Classes> classesSet) {
        this.classesSet = classesSet;
    }

    @Override
    public String toString() {
        return "Tea_ClassKey{" +
                "class_id=" + class_id +
                ", teacher_id=" + teacher_id +
                ", teacherSet=" + teacherSet +
                ", classesSet=" + classesSet +
                '}';
    }

    private Integer teacher_id;

    private Set<Teacher> teacherSet;

    private Set<Classes> classesSet;

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }
}