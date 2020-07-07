package com.ngocvm.example.all.generics.boundedtype;

public class NatureNumber<T extends Integer> {

    private T n;

    public NatureNumber(T n) {
        this.n = n;
    }

    public boolean isEven() {
        return n.intValue() % 2 == 0;
    }
}
