package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String sirname;
        private int age;
        private boolean sex;
        private int weight;
        private String city;


        public Human(String name, String sirname, int age, boolean sex, int weight, String city){
            this.name = name;
            this.sirname = sirname;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.city = city;
        }

        public Human(String name, int age, boolean sex, int weight, String city){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.city = city;
        }

        public Human(String name, String sirname, boolean sex, int weight, String city){
            this.name = name;
            this.sirname = sirname;
            this.sex = sex;
            this.weight = weight;
            this.city = city;
        }

        public Human(String name, String sirname, int age, int weight, String city){
            this.name = name;
            this.sirname = sirname;
            this.age = age;
            this.weight = weight;
            this.city = city;
        }

        public Human(String name, String sirname, int age){
            this.name = name;
            this.sirname = sirname;
            this.age = age;
        }

        public Human(String name, String sirname, int age, boolean sex){
            this.name = name;
            this.sirname = sirname;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, String sirname, int age, boolean sex, int weight){
            this.name = name;
            this.sirname = sirname;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(String name, String sirname, int weight, String city){
            this.name = name;
            this.sirname = sirname;
            this.weight = weight;
            this.city = city;
        }
        public Human(int age, boolean sex, int weight, String city){
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.city = city;
        }
        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }
}
