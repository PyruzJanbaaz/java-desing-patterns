package com.pyruz.factory.pattern;

import com.pyruz.factory.pattern.impl.Circle;
import com.pyruz.factory.pattern.impl.Rectangle;
import com.pyruz.factory.pattern.intrface.Shape;

public class ShapeFactory {

    private ShapeFactory() {
    }

    public static Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;
        if (shapeType.equalsIgnoreCase("circle"))
            return new Circle();
        if (shapeType.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        return null;
    }
}
