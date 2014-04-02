/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarecipes;

import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author cristianchiovari
 */
@Model
//@Named(value = "supposed_to_be_model_annotation")
//@Dependent
//@RequestScoped
public class ModelBean {

    
    @Inject
    SessionBeanForModel beanForModel;
    /**
     * Creates a new instance of ModelBean
     */
    public ModelBean() {
    }

    public String getMessages() {
        return "message from model bean +"+beanForModel.getMessage() ;
    }

}
