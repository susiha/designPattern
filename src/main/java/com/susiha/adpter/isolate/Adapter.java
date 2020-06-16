package com.susiha.adpter.isolate;

import com.susiha.adpter.inter.Socket;

public class Adapter extends Inherit implements Socket {

    private Delegate delegate;
    private String operation;

    public Adapter(String operation){
        this.operation = operation;
        delegate = new Delegate();
    }

    @Override
    public void binaryForInherit(int arg1, int arg2) {
        ternary(operation,arg1,arg2);
    }

    @Override
    public void printForDelegate(String message) {
        delegate.showDetial("this is from Adapter:"+message);
    }
}
