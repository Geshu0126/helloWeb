package com.shuker.pojo;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/28 12:45
 * @Version 1.0
 **/
public class Employee {
    private Integer id ;
    private String lastName ;
    private char gender ;
    private String email ;

    public Employee() {
    }

    public Employee(Integer id, String lastName, char gender, String email) {
        this.id = id;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                '}';
    }
}
