package com.jvm._03tuning._01command.jstack;

import java.util.Map;
import java.util.Set;

/**
 * @description: Java代码获取所有线程的基本信息
 * @author: shangqj
 * @date: 2024/1/24
 * @version: 1.0
 */
public class getAllThreadMes {

    /**
     * 可以通过以下代码对线程进行监控，但是不如直接使用 jstack 命令的结果清晰
     * @param args a
     */
    public static void main(String[] args) {

        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Set<Map.Entry<Thread, StackTraceElement[]>> entries = allStackTraces.entrySet();
        for (Map.Entry<Thread, StackTraceElement[]> entry : entries) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            System.out.println("key = " + key.getName());
            for (StackTraceElement stackTraceElement : value) {
                System.out.println("stackTraceElement = " + stackTraceElement);
            }
        }
    }
}
