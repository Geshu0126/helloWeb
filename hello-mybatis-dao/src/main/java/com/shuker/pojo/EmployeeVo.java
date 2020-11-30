package com.shuker.pojo;

import java.util.List;

/**
 * @ClassName EmployeeVo
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/30 22:47
 * @Version 1.0
 **/
public class EmployeeVo {
    private String lastName ;
    private List<Integer> ids ;

    public EmployeeVo() {
    }

    public EmployeeVo(String lastName, List<Integer> ids) {
        this.lastName = lastName;
        this.ids = ids;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "EmployeeVo{" +
                "lastName='" + lastName + '\'' +
                ", ids=" + ids +
                '}';
    }
}
