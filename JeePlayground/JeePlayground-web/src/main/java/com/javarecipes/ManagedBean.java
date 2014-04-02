/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarecipes;

import javax.inject.Named;

/**
 *
 * @author cristianchiovari
 */
@Named
public class ManagedBean {

    public String getMessage() {
        return "message from named bean ";
    }
}
