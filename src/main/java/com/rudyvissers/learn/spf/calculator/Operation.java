package com.rudyvissers.learn.spf.calculator;

public interface Operation {
    int apply(int lhs, int rhs);
    boolean handles(char op);
}
