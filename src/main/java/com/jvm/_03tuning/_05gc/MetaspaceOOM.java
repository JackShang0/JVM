package com.jvm._03tuning._05gc;

import com.jvm._01param.chapter15.HeapOOM;

import java.util.ArrayList;

/**
 * @description:
 * @author: shangqj
 * @date: 2024/1/30
 * @version: 1.0
 */
public class MetaspaceOOM {
    byte[] buffer = new byte[1 * 1024 * 1024];//1MB

    public static void main(String[] args) {
        ArrayList<HeapOOM> list = new ArrayList<>();

        int count = 0;
        try {
            while (true) {
                Thread.sleep(1000);
                list.add(new HeapOOM());
                count++;
            }
        } catch (Throwable e) {
            System.out.println("count = " + count);
            e.printStackTrace();
        }
    }
}
