package com.inforhomex.app.service.impl;

import com.inforhomex.app.service.Logger;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Singleton;

@Singleton
public class ConsoleLogger implements Logger{
    
    @Override
    public void log(Object obj){
        System.out.println(obj);
    }

    @PostConstruct
    public void initialize(){
        this.log("Ejecutando desde \"ConsoleLogger\".");
    }

    @PreDestroy
    public void destroy(){
        this.log("\"ConsoleLogger\" ha sido eliminado.");
    }
    
}
