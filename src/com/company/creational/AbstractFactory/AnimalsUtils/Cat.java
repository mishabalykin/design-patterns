package com.company.creational.AbstractFactory.AnimalsUtils;

public class Cat implements Animal {
    @Override
    public String getAnimal() {
        return "Cat";
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
