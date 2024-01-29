package com.jvm._03tuning._04param;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.lang.management.ThreadMXBean;

/**
 * @description: Java获取堆内存信息   可用于内置阈值等告警
 * @author: shangqj
 * @date: 2024/1/29
 * @version: 1.0
 */
public class MemoryMonitor {
    public static void main(String[] args) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage heapMemoryUsage = memoryMXBean.getHeapMemoryUsage();
        System.out.println("INIT HEAP = " + heapMemoryUsage.getInit()/1024/1024 + "m");
        System.out.println("MAX HEAP = " + heapMemoryUsage.getMax()/1024/1024 + "m");
        System.out.println("USE HEAP = " + heapMemoryUsage.getUsed()/1024/1024 + "m");
        System.out.println("Heap Memory Usage = " + memoryMXBean.getHeapMemoryUsage());
        System.out.println("USE HEAP = " + memoryMXBean.getNonHeapMemoryUsage());


        System.out.println("通过java来获取相关系统状态");
        System.out.println("当前堆内存大小"+(int)Runtime.getRuntime().totalMemory()/1024/1024 + "m");
        System.out.println("空闲堆内存大小"+(int)Runtime.getRuntime().freeMemory()/1024/1024 + "m");
        System.out.println("最大可用堆内存大小"+(int)Runtime.getRuntime().maxMemory()/1024/1024 + "m");


    }
}
