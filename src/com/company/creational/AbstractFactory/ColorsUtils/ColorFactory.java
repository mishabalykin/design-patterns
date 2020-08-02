package com.company.creational.AbstractFactory.ColorsUtils;

import com.company.creational.AbstractFactory.AbstractFactory;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String colorType) {
        if("White".equalsIgnoreCase(colorType)){
            return new White();
        }else if ("Black".equalsIgnoreCase(colorType)){
            return new Black();
        } else return null;
    }
}
