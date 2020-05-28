package com.jali.d8_visitor.a_quickstart;

/**
 * 电脑的组成部分
 */
public abstract class ComputerPart {
    abstract void accept(Visitor visitor);

    /**
     * 获取该组件的市场价格
     * @return
     */
    abstract double getPrice();
}
