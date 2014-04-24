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

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppAsyncListener implements AsyncListener {

    @Override
    public void onComplete(AsyncEvent asyncEvent) throws IOException {
        System.out.println("AppAsyncListener onComplete");
        
    }

    @Override
    public void onError(AsyncEvent asyncEvent) throws IOException {
        System.out.println("AppAsyncListener onError");
        
        //we can return error response to client
    }

    @Override
    public void onStartAsync(AsyncEvent asyncEvent) throws IOException {
        System.out.println("AppAsyncListener onStartAsync");
        asyncEvent.getSuppliedRequest().setAttribute("starttime", System.currentTimeMillis());
        //we can log the event here
    }

    @Override
    public void onTimeout(AsyncEvent asyncEvent) throws IOException {
        System.out.println("AppAsyncListener onTimeout");
        
        //we can send appropriate response to client
        ServletResponse response = asyncEvent.getAsyncContext().getResponse();
        PrintWriter out = response.getWriter();
        out.write("TimeOut Error in Processing");
    }

}
