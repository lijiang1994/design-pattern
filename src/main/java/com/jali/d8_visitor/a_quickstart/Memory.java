package com.jali.d8_visitor.a_quickstart;

/**
 * 内存
 */
public class Memory extends ComputerPart {
    @Override
    void accept(Visitor visitor) {
        visitor.visitMemory(this);
    }

    @Override
    public double getPrice() {
        return 600;
    }
}
