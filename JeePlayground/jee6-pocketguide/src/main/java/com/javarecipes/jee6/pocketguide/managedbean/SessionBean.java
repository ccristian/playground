/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javarecipes.jee6.pocketguide.managedbean;

import javax.ejb.Stateless;
import javax.inject.Named;

/**
 *
 * @author cristianchiovari
 */
@Stateless
@Named
public class SessionBean {

    public String message(){
        return "message from SessionBean";
    }
}
