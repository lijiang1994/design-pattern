package com.jali.d4_facade.a_quickstart;

/**
 * 开始给她写信
 * @author lijiang
 * @create 2020-05-14 10:12
 */
public class Client {

    public static void main(String[] args) {
        LetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("I love you！");
        letterProcess.fillEnvelope("收件人：静静  地址：北京东路");
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();

        // 使用门面模式
        ModernPostOffice modernPostOffice = new ModernPostOffice();
        modernPostOffice.sendLetter("I love you!", "收件人：静静  地址：北京东路");

    }
}
