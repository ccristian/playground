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
public class TestingLongProcess {

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            Math.atan(Math.sqrt(Math.pow(10, 10)));
             Math.atan(Math.sqrt(Math.pow(12, 10)));
             Math.atan(Math.sqrt(Math.pow(12, 10)));
             Math.atan(Math.sqrt(Math.pow(12, 10)));
             Math.atan(Math.sqrt(Math.pow(12, 10)));
             Math.atan(Math.sqrt(Math.pow(12, 10)));
        }
        long t2 = System.currentTimeMillis();
        System.out.println("time:"+(t2-t1));
    }
}
