package com.jali.d8_visitor.a_quickstart;

/**
 * 查看信息的接口
 */
public interface Visitor {
    // 查看CPU
    void visitCpu(CPU cpu);
    // 查看内存
    void visitMemory(Memory memory);
    // 查看主板
    void visitBoard(Board board);
}
