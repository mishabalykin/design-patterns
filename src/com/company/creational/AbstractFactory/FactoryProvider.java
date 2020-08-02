package com.company.creational.AbstractFactory;

import com.company.creational.AbstractFactory.AnimalsUtils.AnimalFactory;
import com.company.creational.AbstractFactory.ColorsUtils.ColorFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String factoryType) {
        if ("Animal".equalsIgnoreCase(factoryType)) {
            return new AnimalFactory();
        } else if ("Color".equalsIgnoreCase(factoryType)) {
            return new ColorFactory();
        } else return null;
    }
}
