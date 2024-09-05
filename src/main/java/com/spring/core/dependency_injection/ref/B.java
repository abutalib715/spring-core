package com.spring.core.dependency_injection.ref;

public class B {
    private Integer y;

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                '}';
    }
}
