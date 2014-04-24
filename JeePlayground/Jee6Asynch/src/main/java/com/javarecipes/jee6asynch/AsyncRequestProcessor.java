/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarecipes.jee6asynch;

/**
 *
 * @author cristianchiovari
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;

public class AsyncRequestProcessor implements Runnable {

    private AsyncContext asyncContext;
    private int secs;

    public AsyncRequestProcessor() {
    }

    public AsyncRequestProcessor(AsyncContext asyncCtx, int secs) {
        this.asyncContext = asyncCtx;
        this.secs = secs;
    }

    @Override
    public void run() {
        System.out.println("Async Supported? "
                + asyncContext.getRequest().isAsyncSupported());
        long t1= System.currentTimeMillis();
        longCpuProcessing(secs);
         long t2= System.currentTimeMillis();
        if (asyncContext != null && asyncContext.getResponse() != null) {
            try {

                PrintWriter out = asyncContext.getResponse().getWriter();
                String message = "Processing done for " + (t2-t1) + " milliseconds!!";
                System.out.println(message);
                out.write(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
            asyncContext.complete();
        }
        //complete the processing

    }

    private void longProcessing(int secs) {
        // wait for given time before finishing
        try {
            Thread.sleep(secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private void longCpuProcessing(int secs) {
        // wait for given time before finishing
        try {
            for (int i = 0; i < 100000000; i++) {
                Math.atan(Math.sqrt(Math.pow(10, 10)));
                Math.atan(Math.sqrt(Math.pow(12, 10)));
                Math.atan(Math.sqrt(Math.pow(12, 10)));
                Math.atan(Math.sqrt(Math.pow(12, 10)));
                Math.atan(Math.sqrt(Math.pow(12, 10)));
                Math.atan(Math.sqrt(Math.pow(12, 10)));
            }
            /*double val = 10;
             for (;;) {
             Math.atan(Math.sqrt(Math.pow(val, 10)));
             }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
