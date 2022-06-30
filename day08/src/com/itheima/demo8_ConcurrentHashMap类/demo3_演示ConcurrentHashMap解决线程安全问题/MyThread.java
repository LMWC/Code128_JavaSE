package com.itheima.demo8_ConcurrentHashMap类.demo3_演示ConcurrentHashMap解决线程安全问题;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThread extends Thread{
    // 共享变量
    //static HashMap<Integer,Integer> map = new HashMap<>();// 线程不安全
    //static Hashtable<Integer,Integer> map = new Hashtable<>();// 线程安全
    static ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();// 线程安全

    @Override
    public void run() {
        // 往HashMap集合中添加5万个键值对
        for (int i = 0; i < 50000; i++) {
            map.put(i,i);
        }
        System.out.println("子线程操作完毕!");
    }
}
