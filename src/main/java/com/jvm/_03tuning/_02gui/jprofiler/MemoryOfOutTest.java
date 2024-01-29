package com.jvm._03tuning._02gui.jprofiler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: shangqj
 * @date: 2024/1/25
 * @version: 1.0
 */
public class MemoryOfOutTest {
    public static void main(String[] args) {
        while (true) {
            ArrayList list = new ArrayList<>();
            for (int i = 0; i < 500; i++) {
                Bean bean = new Bean();
                bean.arrayList.add(new byte[1024 * 10]);  //10kb
                list.add(bean);
            }

            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class Bean {
    int size = 10;
    String info = "hello";
    //static List arrayList = new ArrayList();

    //将对象的取消静态，则可以被顺利回收，从而解决内存泄漏问题
    List arrayList = new ArrayList();
}