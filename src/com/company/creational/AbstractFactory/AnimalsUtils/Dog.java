package com.company.creational.AbstractFactory.AnimalsUtils;

public class Dog implements Animal {
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
