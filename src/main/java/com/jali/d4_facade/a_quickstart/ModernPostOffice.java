package com.jali.d4_facade.a_quickstart;

/**
 * 若后续这个流程需要发生调整，只需要改ModernPostOffice这个类
 * 客户端根本就不知道发生了什么变化，也无需关心
 * @author lijiang
 * @create 2020-05-14 10:18
 */
public class ModernPostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();

    /**
     * 写信，封装，投递，一体化
     * 用户只需要知道这个方法，里面具体的方法和流程不用关心，这就是门面模式
     * @param context
     * @param address
     */
    public void sendLetter(String context, String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
