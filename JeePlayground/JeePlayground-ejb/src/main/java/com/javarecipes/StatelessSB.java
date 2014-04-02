/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarecipes;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author cristianchiovari
 */
@Stateless
@LocalBean
public class StatelessSB {

    public String getMessage() {
        return "Message from StatelessSB";
    }
}
