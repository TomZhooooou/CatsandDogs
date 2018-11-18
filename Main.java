package com.company;

import java.io.*;
import java.util.*;

import java.lang.*;
interface iMakeSound
{
    public void make_sound();
    public String description();


}
class Animal implements iMakeSound{

    private int age;
    private String name;
    private String breed;

    public Animal(int age, String name, String breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    public int get_age() {
        return age;
    }

    public void set_age(int age) {
        this.age = age;
    }

    public String get_name() {
        return name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_breed() {
        return breed;
    }

    public void set_breed(String breed) {
        this.breed = breed;
    }

    public void make_sound() {
        System.out.println("Any");
    }
    public String description()
    {
        return ("..");
    }
}

class Dog extends Animal {

    public Dog(int age, String name, String breed) {
        super(age, name, breed);
    }

    public void make_sound() {
        System.out.println("Meow");
    }
    public String description ()
    {
       return("Dog that is a "+ get_age()+ " years old "+ get_name()+" "+ get_breed());
    }
}
class Cat extends Animal {

    public Cat(int age, String name, String breed) {
        super(age, name, breed);
    }

    public void make_sound() {
        System.out.println("Wong");
    }
    public String description()
    {
        return ("Cat that is a "+ get_age()+ " years old "+ get_name()+" "+ get_breed());
    }
}
public class Main {

    public static void main(String[] args) {
        // write your code here
//        Animal Tom = new Dog(11, "Husky", "Golden Retriver");
//        Tom.make_sound();
//        Animal Jerry = new Cat( 12, "Tom","Mouse");
//        Jerry.make_sound();
       // System.out.println("Hello Java Programming elective II " + Tom.get_age() + " " + Tom.get_name() + " " + Tom.get_breed());
//Animal[] a = new Animal[10];
//for (int i =0; i<a.length; i++)
//        {
//            if (i % 2 == 0)
//             a[i]= new Dog(11, "Husky", "Golden Retriver");
//
//
//            else a[i] = new Cat(11, "Husky", "Golden Retriver");
//
//        }
//for (int i = 0 ; i<a.length; i++)
//    {
//        a[i].make_sound();
//    }

        Animal re = new  Dog(11, "a","retriver");
        re.make_sound();
        System.out.println(re.description());
}
}
