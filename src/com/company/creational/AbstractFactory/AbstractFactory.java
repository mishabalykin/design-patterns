package com.company.creational.AbstractFactory;

public interface AbstractFactory<T> {
    T create(String type);
}
