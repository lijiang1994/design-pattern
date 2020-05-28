package com.jali.d8_visitor.a_quickstart;

/**
 * 主板
 */
public class Board extends ComputerPart{
    @Override
    void accept(Visitor visitor) {
        visitor.visitBoard(this);
    }

    @Override
    public double getPrice() {
        return 900;
    }
}
