package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandMaMa = new Human("Вероника Ивановна", false, 80),
                grandFaMa = new Human("Виктор Петрович", true, 81),
                grandMaFa = new Human("Екатерина Андреевна", false,73),
                grandFaFa = new Human("Сергей Анатольевич", true, 75),
                mother = new Human("Людмила Викторовна", false, 32, grandFaMa, grandMaMa),
                father = new Human("Дмитрий Сергеевич", true, 29, grandFaFa, grandMaFa),
                son1 = new Human("Константин Дмитриевич", true, 12, father, mother),
                son2 = new Human("Петр Дмитриевич", true, 12, father, mother),
                doughter = new Human("Юлия Дмитриевна", false, 12, father, mother);
        System.out.println(grandFaFa);
        System.out.println(grandFaMa);
        System.out.println(grandMaFa);
        System.out.println(grandMaMa);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(doughter);
    }

    public static class Human {
        // напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public Human father, mother;

        public Human(String name, boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }

        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}