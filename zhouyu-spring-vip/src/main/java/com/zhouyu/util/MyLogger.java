package com.zhouyu.util;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class MyLogger {

    public MyLogger() {

    }

    public static Logger MyLogger(Class targetClass){
        Logger logger =  Logger.getLogger(targetClass);
        logger.setLevel(Level.DEBUG);
        System.out.println("logger enabled... ...");
        return logger;
    }


}
