package com.jali.d4_facade.a_quickstart;

/**
 * @author lijiang
 * @create 2020-05-14 10:02
 */
public interface LetterProcess {

    /**
     * 写信的内容
     * @param context
     */
    void writeContext(String context);

    /**
     * 其次写封信
     * @param address
     */
    void fillEnvelope(String address);

    /**
     * 把信放到信封里
     */
    void letterIntoEnvelope();

    /**
     * 然后邮递
     */
    void sendLetter();
}
