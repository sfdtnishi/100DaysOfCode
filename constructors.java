package com.OOPs;

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(){
        System.out.println("non-parameterized constructor");
    }

    Student(String name1, int age1){
        System.out.println("parameterized constructor");
        this.name = name1;
        this.age = age1;

    }

    Student(Student s3){
        System.out.println("copy constructor");
        this.name = s3.name;
        this.age = s3.age;
    }
}

public class constructors {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "nishi";
        s1.age = 19;
        s1.printInfo();

        Student s2 = new Student("shruti", 21);
        s2.printInfo();

        Student s3 = new Student(s1);
        s3.printInfo();
    }
}

