package com.spring;


import com.zhouyu.service.UserService;
import com.zhouyu.util.MyLogger;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.lang.annotation.Annotation;

public class ZhouyuApplicationContext {

    Logger logger  = MyLogger.MyLogger(ZhouyuApplicationContext.class);
    private Class configClass;

    public ZhouyuApplicationContext(Class configClass) {
        this.configClass = configClass;

        //在构造方法里面做扫描，如何扫描？
        // 扫描
        if(configClass.isAnnotationPresent(ComponentScan.class)){
            //获得传入类的CompontScan
            ComponentScan componentScanAnnotation = (ComponentScan) configClass.getAnnotation(ComponentScan.class);
            String path = componentScanAnnotation.value();

            logger.debug("path is : " +path);
        }





    }


    public Object getBean(String beanName){

        return null;
    }



}
