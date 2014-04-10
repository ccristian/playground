/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarecipes.jee6.pocketguide.managedbean;

import javax.inject.Named;

/**
 *
 * @author cristianchiovari
 */
@Named
public class ManagedBean {

    public String message() {
        return "Message from ManagedBean with @Named";
    }

}
