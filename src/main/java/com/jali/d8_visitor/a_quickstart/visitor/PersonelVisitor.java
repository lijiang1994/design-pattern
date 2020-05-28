package com.jali.d8_visitor.a_quickstart.visitor;

import com.jali.d8_visitor.a_quickstart.Board;
import com.jali.d8_visitor.a_quickstart.CPU;
import com.jali.d8_visitor.a_quickstart.Memory;
import com.jali.d8_visitor.a_quickstart.Visitor;

/**
 * 员工访问到的信息
 */
public class PersonelVisitor implements Visitor {
    public double tootalPrice = 0.0;

    @Override
    public void visitCpu(CPU cpu) {
        // 员工处理器打85折
        tootalPrice += cpu.getPrice() * 0.85;
    }

    @Override
    public void visitMemory(Memory memory) {
        // 员工内存打9折
        tootalPrice += memory.getPrice() * 0.90;
    }

    @Override
    public void visitBoard(Board board) {
        // 员工主板打8折
        tootalPrice += board.getPrice() * 0.80;
    }
}
