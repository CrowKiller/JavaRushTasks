package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

public class Dog {
    //напишите тут ваш код
    public String name;
    public int age;

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public static void main(String[] args) {
       /* Dog dog = new Dog();
        dog.setAge(25);
        dog.setName("Sharik");
        System.out.println(dog.getName() + dog.getAge());
        System.out.println(dog.name + dog.age);*/

    }
}
