package com.spring.core.ref;

public class A {
    private Integer x;
    private B objB;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public B getObjB() {
        return objB;
    }

    public void setObjB(B objB) {
        this.objB = objB;
    }

    public A(Integer x, B objB) {
        this.x = x;
        this.objB = objB;
    }
    public A() {
        super();
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", objB=" + objB +
                '}';
    }
}
