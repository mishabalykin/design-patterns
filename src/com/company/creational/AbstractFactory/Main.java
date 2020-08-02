package com.company.creational.AbstractFactory;

import com.company.creational.AbstractFactory.AnimalsUtils.Animal;
import com.company.creational.AbstractFactory.AnimalsUtils.AnimalFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory<Animal> animalFactory = FactoryProvider.getFactory("Animal");
        Animal cat = animalFactory.create("Cat");
        cat.makeSound();
        Animal dog = animalFactory.create("Dog");
        dog.makeSound();
    }
}
