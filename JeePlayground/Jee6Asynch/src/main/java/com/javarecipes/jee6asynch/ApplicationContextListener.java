/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarecipes.jee6asynch;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Web application lifecycle listener.
 *
 * @author cristianchiovari
 */
@WebListener()
public class ApplicationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        // create the thread pool
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 50000L,
                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(32));
        sce.getServletContext().setAttribute("executor",
                executor);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) sce
                .getServletContext().getAttribute("executor");
        executor.shutdown();
    }
}
