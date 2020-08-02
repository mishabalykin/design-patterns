package com.company.creational.AbstractFactory.AnimalsUtils;

import com.company.creational.AbstractFactory.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String animalType) {
        if ("Cat".equalsIgnoreCase(animalType)) {
            return new Cat();
        } else if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else return null;
    }
}
