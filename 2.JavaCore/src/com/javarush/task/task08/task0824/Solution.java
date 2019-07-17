package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human children1 = new Human("Петя", true, 12);
        Human children2 = new Human("Вася", true, 10);
        Human children3 = new Human("Маша", false, 8);
        ArrayList<Human> childrens = new ArrayList<Human>() ;
        childrens.add(children1);
        childrens.add(children2);
        childrens.add(children3);

        Human father = new Human("Виктор Петрович", true, 33, childrens);
        Human mother = new Human("Светлана Ивановка", false, 32, childrens);
        //ArrayList<Human> childrens2 = (ArrayList<Human>) Arrays.asList(father, mother);
        ArrayList<Human> fatherArr = new ArrayList<Human>() ;
        fatherArr.add(father);
        ArrayList<Human> motherArr = new ArrayList<Human>() ;
        motherArr.add(mother);

        Human grandFaFa = new Human("Петр Иванович", true, 68, fatherArr);
        Human grandMaFa = new Human("Виолетта Петровна", false, 70, fatherArr);
        Human grandFaMa = new Human("Иван Андреевич", true, 68, motherArr);
        Human grandMaMa = new Human("Людмила Карповна", false, 55, motherArr);


        System.out.println(grandFaFa);
        System.out.println(grandFaMa);
        System.out.println(grandMaFa);
        System.out.println(grandMaMa);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);

    }

    public static class Human {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.children!=null){
                int childCount = this.children.size();
                if (childCount > 0) {
                    text += ", дети: " + this.children.get(0).name;

                    for (int i = 1; i < childCount; i++) {
                        Human child = this.children.get(i);
                        text += ", " + child.name;
                    }
                }
            }
            return text;
        }

        public Human(String name, boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children=children;
        }
    }

}
