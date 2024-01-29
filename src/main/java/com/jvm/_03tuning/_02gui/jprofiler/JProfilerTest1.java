package com.jvm._03tuning._02gui.jprofiler;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: shangqj
 * @date: 2024/1/25
 * @version: 1.0
 */
public class JProfilerTest1 {
    public static void main(String[] args) {
        while (true){
            ArrayList<Data> list = new ArrayList<>();
            for (int i = 0; i < 500; i++) {
                Data data = new Data();
                list.add(data);
            }

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class Data{
    private int size = 10;
    private byte[] buffer = new byte[1024*1024];  //1mb
    private String info = "hello ";
}
