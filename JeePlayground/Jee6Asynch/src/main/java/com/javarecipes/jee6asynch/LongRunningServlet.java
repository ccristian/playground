/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarecipes.jee6asynch;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LongRunningServlet")
public class LongRunningServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        long startTime = System.currentTimeMillis();
        System.out.println("LongRunningServlet Start::Name="
                + Thread.currentThread().getName() + "::ID="
                + Thread.currentThread().getId());

        String time = request.getParameter("time");
        int secs = Integer.valueOf(time);
        // max 10 seconds
        if (secs > 10000) {
            secs = 10000;
        }

        longCpuProcessing(secs);

        PrintWriter out = response.getWriter();
        long endTime = System.currentTimeMillis();
        out.write("Processing done for " + secs + " milliseconds!!");
        System.out.println("LongRunningServlet Start::Name="
                + Thread.currentThread().getName() + "::ID="
                + Thread.currentThread().getId() + "::Time Taken="
                + (endTime - startTime) + " ms.");
    }

    private void longProcessing(int secs) {
        // wait for given time before finishing
        try {
            Thread.sleep(secs);
            /*double val = 10;
             for (;;) {
             Math.atan(Math.sqrt(Math.pow(val, 10)));
             }*/
        } catch (Exception e) {
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
