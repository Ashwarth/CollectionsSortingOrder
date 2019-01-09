package com.suseela;

import com.suseela.employeesortig.EmployeeName;
import com.suseela.employeesortig.EmployeeSorting;
import com.suseela.stringbufersorting.StringBufferSortingOrder;
import com.suseela.treesetwithStrings.Test;
import treeset.SortingOrder;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(new SortingOrder());
        numbers.add(10);
        numbers.add(20);
        numbers.add(56);
        numbers.add(21);
        numbers.add(81);
        numbers.add(6555);
        numbers.add(8888);
        System.out.println("number sorting order");
        numbers.forEach(System.out::println);

        System.out.println();

        TreeSet<String> sortedString = new TreeSet<String>(new Test());
        sortedString.add("hello");
        sortedString.add("hai");
        sortedString.add("welcome");
        sortedString.add("java");
        sortedString.add("spring");
        sortedString.add("hiberate");
        System.out.println("string sorting order");
        sortedString.forEach(System.out::println);

        TreeSet sortedStringBuffer = new TreeSet(new StringBufferSortingOrder());
        sortedStringBuffer.add(new StringBuffer("hello"));
        sortedStringBuffer.add(new StringBuffer("hai"));
        sortedStringBuffer.add(new StringBuffer("welome"));
        sortedStringBuffer.add(new StringBuffer("spring"));
        sortedStringBuffer.add(new StringBuffer("hibernate"));
        sortedStringBuffer.add(new StringBuffer("prabha"));
        sortedStringBuffer.add(new StringBuffer("sahesha"));
        System.out.println();
        System.out.println("stringbuffer sorting order");
        sortedStringBuffer.forEach(System.out::println);

        EmployeeSorting emp = new EmployeeSorting("sai", 111);
        EmployeeSorting emp1 = new EmployeeSorting("sahesha", 222);
        EmployeeSorting emp2 = new EmployeeSorting("prabha", 333);
        EmployeeSorting emp3 = new EmployeeSorting("chitti", 444);
        TreeSet<Object> empSorting = new TreeSet<>();
        empSorting.add(emp);
        empSorting.add(emp1);
        empSorting.add(emp2);
        empSorting.add(emp3);
        System.out.println();
        System.out.println("employee sorting order");
        empSorting.forEach(System.out::println);


        TreeSet empNameSorting=new TreeSet(new EmployeeName());

        EmployeeSorting empname = new EmployeeSorting("sai", 111);
        EmployeeSorting emp1name2 = new EmployeeSorting("sahesha", 222);
        EmployeeSorting emp2name3 = new EmployeeSorting("prabha", 333);
        EmployeeSorting emp3name4 = new EmployeeSorting("chitti", 444);



        empNameSorting.add(empname);
        empNameSorting.add(emp1name2);
        empNameSorting.add(emp2name3);
        empNameSorting.add(emp3);
        System.out.println();
        System.out.println("employee sorting order");
        empNameSorting.forEach(System.out::println);



    }

}
