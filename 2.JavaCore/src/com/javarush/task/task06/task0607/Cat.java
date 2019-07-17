package com.javarush.task.task06.task0607;

/* 
Классовый счетчик
*/

public class Cat {
    //напишите тут ваш код
    public static int catCount=0;

    public int age;

    public String name;

    public Cat(int age, String name){
        this.age=age;
        this.name=name;
        Cat.catCount++;
    }

    public static void main(String[] args) {
        Cat boris = new Cat(2,"Boris");
        Cat vasya = new Cat(3,"Vasya");
        vasya = boris;
        vasya.name="Not boris";
        vasya.age = 8;
        System.out.println(vasya.name + " " + boris.name + " " + vasya + " " + boris);

    }
}
