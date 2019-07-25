package com.wyh.demo.test;

import com.sun.javafx.scene.control.skin.TextAreaSkin;
import java.util.ArrayList;

public class ThreadTest implements  Runnable{
    private int index = 1;
    private final static int MAX = 500;
    private  final static Object METUX = new Object();
    public static void main(String[] args) throws InterruptedException {
        ThreadTest task = new ThreadTest();
        Thread thread1 = new Thread(task,"1");
        Thread thread2 = new Thread(task,"2");
        Thread thread3 = new Thread(task,"3");
        Thread thread4 = new Thread(task,"4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        ArrayList<String> arr = new ArrayList<String>();
    }
    @Override
    public void run() {
        synchronized (METUX){
            while(index < MAX){
                System.out.println(Thread.currentThread() +"---"+ index++ );
            }
        }
    }
}
