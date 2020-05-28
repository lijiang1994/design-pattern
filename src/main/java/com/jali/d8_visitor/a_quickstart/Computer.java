package com.jali.d8_visitor.a_quickstart;

import com.jali.d8_visitor.a_quickstart.visitor.LeaderVisitor;
import com.jali.d8_visitor.a_quickstart.visitor.PersonelVisitor;

/**
 * 电脑
 */
public class Computer {

    ComputerPart cpu = new CPU();
    ComputerPart memory = new Memory();
    ComputerPart board = new Board();

    public void accept(Visitor visitor){
        this.cpu.accept(visitor);
        this.memory.accept(visitor);
        this.board.accept(visitor);
    }

    public static void main(String[] args) {
        PersonelVisitor p = new PersonelVisitor();
        Computer computer = new Computer();
        computer.accept(p);
        System.out.println(p.tootalPrice);

        LeaderVisitor l = new LeaderVisitor();
        computer.accept(l);
        System.out.println(l.tootalPrice);
    }
}
