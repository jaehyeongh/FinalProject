package com.project.saishu.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging{
    private  Class clazz;

    public Logging(){;}

    public Logging(Class clazz){
        this.clazz = clazz;
    }

    public void setLogger(Class clazz){
        this.clazz = clazz;
    }

    public Logger getLogger(){
        return LoggerFactory.getLogger(this.clazz);
    }
}
