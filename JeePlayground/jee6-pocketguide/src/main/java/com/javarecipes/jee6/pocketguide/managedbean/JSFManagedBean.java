/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarecipes.jee6.pocketguide.managedbean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author cristianchiovari
 */
@Named(value = "jSFManagedBean")
@Dependent
public class JSFManagedBean {

    /**
     * Creates a new instance of JSFManagedBean
     */
    public JSFManagedBean() {
    }

    public String message() {
        return "message from JSFManagedBean";
    }

}
