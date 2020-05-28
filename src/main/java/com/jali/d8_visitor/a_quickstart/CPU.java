package com.jali.d8_visitor.a_quickstart;

/**
 * @author lijiang
 * @create 2020-05-28 23:30
 */
public class CPU extends ComputerPart{
    @Override
    void accept(Visitor visitor) {
        visitor.visitCpu(this);
    }

    @Override
    public double getPrice() {
        return 1400;
    }
}
