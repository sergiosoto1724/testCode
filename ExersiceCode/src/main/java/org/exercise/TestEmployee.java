package org.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployee {
    private int id;
    private String name;
    private Double salary;

    public TestEmployee(int id, String name, double salary){
        this.id= id;
        this.name=name;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<TestEmployee> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(new TestEmployee(001,"Ivanna", 900.00));
        listOfEmployee.add(new TestEmployee(002,"Steve", 500.00));
        listOfEmployee.add(new TestEmployee(003,"Maria", 400.00));
        listOfEmployee.add(new TestEmployee(004,"Kim", 800.00));
        listOfEmployee.add(new TestEmployee(005,"Sergio", 700.00));

        List<String> listOfEmployeeHavingSalMoreThan500 = listOfEmployee.stream()
                .filter(s -> s.getSalary()>500)
                        .map(TestEmployee::getName)
                .collect(Collectors.toList());

        List<TestEmployee> listOfEmployeewithIncrementBy10 = listOfEmployee.stream()
                .map(s->{
                    s.setSalary(s.getSalary()*1.1)
                    ;return s;})
                .collect(Collectors.toList());

        listOfEmployee.stream()
                .sorted(Comparator.comparing(TestEmployee::getSalary)
                        .reversed()).
                findFirst().
                get();

}
}
