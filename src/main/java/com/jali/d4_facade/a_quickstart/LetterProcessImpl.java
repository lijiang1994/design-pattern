package com.jali.d4_facade.a_quickstart;

/**
 * @author lijiang
 * @create 2020-05-14 10:09
 */
public class LetterProcessImpl implements LetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容：" + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("address info: " + address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信放到信封中...");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮寄信件");
    }
}
