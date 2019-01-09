package com.suseela.employeesortig;

import java.util.Comparator;

public class EmployeeSorting  implements Comparable {
    String name;
    int id;


    public EmployeeSorting(String name, int id) {
        this.name = name;
        this.id = id;
    }



    @Override
    public String toString() {
        return "EmployeeSorting{" +
                "name='" + name + "-" +
                ", id=" + id +
                '}';
    }


    @Override
    public int compareTo(Object o2) {
        int id1=  this.id;
        EmployeeSorting emp= (EmployeeSorting)o2;
        int id2=emp.id;
        if(id1<id2)
        {
            return -1;
        }else if(id1>id2)
        {
            return +1;
        }
        return 0;

    }
}
