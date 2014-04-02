/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javarecipes;

import javax.ejb.Stateless;

/**
 *
 * @author cristianchiovari
 */
@Stateless
public class SessionBeanForModel {
    
    public String getMessage(){
        return "message from session bean for model";
    }
}
