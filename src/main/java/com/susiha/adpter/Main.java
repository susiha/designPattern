package com.susiha.adpter;


import com.susiha.adpter.isolate.Adapter;

public class Main {

    public static void main(String[] args) {

        Adapter adapter = new Adapter("加");

        adapter.binaryForInherit(4,6);
        adapter.printForDelegate("Hello adapter");

    }

}
