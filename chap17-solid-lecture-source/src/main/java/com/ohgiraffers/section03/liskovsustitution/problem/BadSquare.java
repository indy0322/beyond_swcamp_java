package com.ohgiraffers.section03.liskovsustitution.problem;

public class BadSquare extends BadRectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); //LSP 위반 => 부모의 원래 의도와 다르게 자식의 코드가 작동한다.
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height); //LSP 위반
    }
}
