package com.ohgiraffers.section03.liskovsustitution.resolved;

import java.awt.*;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return (int)Math.pow(side,2);
    }
}
