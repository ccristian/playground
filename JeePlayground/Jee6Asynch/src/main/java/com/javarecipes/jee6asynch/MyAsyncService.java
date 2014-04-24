/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javarecipes.jee6asynch;

import javax.servlet.AsyncContext;

/**
 *
 * @author cristianchiovari
 */
public class MyAsyncService implements Runnable {
    AsyncContext ac;

    public MyAsyncService(AsyncContext ac) {
        this.ac = ac;
    }

    @Override
    public void run() {
        System.out.println("Some long running process in MyAsyncService");
    }
}

