package com.susiha.adpter.inter;

public interface Socket {
    /**
     * 使用继承的方式
     * @param arg1
     * @param arg2
     */
   void binaryForInherit(int arg1,int arg2);

    /**
     * 打印信息 使用代理的方式
     * @param message
     */
   void printForDelegate(String message);
}
