package com.chnulabs.students;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private String groupNumber;

    public Student(String name, String groupNumber){
        this.name=name;
        this.groupNumber=groupNumber;
    }
    public String getName(){
        return name;
    }

    public String getGroupNumber(){
        return groupNumber;
    }

    private final static ArrayList<Student> students=new ArrayList<Student>(Arrays.asList(
            new Student("Іванов Роман", "301"),
            new Student("Петров Федір", "301"),
            new Student("Карпінський Богдан","ІПЗ19-1"),
            new Student("Клименко Іван","ІПЗ19-1"),
            new Student("Забіяка Богдан","ІПЗ19-1"),
            new Student("Янішевський Сергій","ІПЗ19-1"),
            new Student("Забивний Юрій","ІПЗ19-1"),
            new Student("Джавелін Катерина","ІПЗ19-1"),
            new Student("Маск Ілона","ІПЗ19-1"),
            new Student("Бендера Максим","ІПЗ19-1"),
            new Student("Осадча Оксана", "302"),
            new Student("Максимов Руслан", "302"),
            new Student("Осадча Оксана", "308"),
            new Student("Петров Федір", "308"),
            new Student("Іванов Роман", "308"),
            new Student("Максимов Руслан", "308"),
            new Student("Потапова Марія", "308"),
            new Student("Гонський Іван", "308"),
            new Student("Васильєв Максим", "308"),
            new Student("Васильєв Кирило", "308"),
            new Student("Потапова Оксана", "308"),
            new Student("Гонський Максим", "308"),
            new Student("Потапова Марія", "309"),
            new Student("Гонський Іван", "309"),
            new Student("Васильєв Максим", "309")

    ));

    public static ArrayList<Student> getStudents(){
        return getStudents("");
    }

    public static ArrayList<Student> getStudents(String groupNumber){
        ArrayList<Student> stList=new ArrayList<>();
        for(Student s: students){
            if(s.getGroupNumber().equals(groupNumber)|| (groupNumber == "")){
                stList.add(s);
            }
        }
        return stList;
    }
    @Override
    public String toString() {
        return name;
    }
}
