package com.jali.d8_visitor.a_quickstart.visitor;

import com.jali.d8_visitor.a_quickstart.Board;
import com.jali.d8_visitor.a_quickstart.CPU;
import com.jali.d8_visitor.a_quickstart.Memory;
import com.jali.d8_visitor.a_quickstart.Visitor;

/**
 * 领导访问到的信息
 */
public class LeaderVisitor implements Visitor {

    public double tootalPrice = 0.0;

    @Override
    public void visitCpu(CPU cpu) {
        // 领导处理器打65折
        tootalPrice += cpu.getPrice() * 0.65;
    }

    @Override
    public void visitMemory(Memory memory) {
        // 领导内存打7折
        tootalPrice += memory.getPrice() * 0.70;
    }

    @Override
    public void visitBoard(Board board) {
        // 领导主板打6折
        tootalPrice += board.getPrice() * 0.60;
    }
}
