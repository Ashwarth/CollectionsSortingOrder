package com.suseela.employeesortig;

import java.util.Comparator;

public class EmployeeName  implements Comparator {
  String name;
  int id;

    public EmployeeName(String name,int id) {
        this.name = name;
        this.id = id;
    }

    public EmployeeName() {

    }


    @Override
    public String toString() {
        return "EmployeeName{" +
                "name='" + name + "-" +
                ", id=" + id +
                '}';
    }

    @Override
    public int compare(Object o1, Object o2) {
        String name1=o1.toString();
        String name2=o2.toString();
        return name1.compareTo(name2);
    }
}
