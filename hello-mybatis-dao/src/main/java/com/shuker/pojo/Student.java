package com.shuker.pojo;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/28 17:53
 * @Version 1.0
 **/
public class Student {
    private Integer id ;
    private  String name ;
    private char gender ;
    private String email ;

    public Student() {
    }

    public Student(Integer id, String name, char gender, String email) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public Integer getId(){
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                '}';
    }
}
