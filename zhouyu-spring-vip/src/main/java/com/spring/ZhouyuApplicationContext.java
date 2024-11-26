package com.spring;


import com.zhouyu.service.UserService;
import com.zhouyu.util.MyLogger;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URL;

public class ZhouyuApplicationContext {

    private Class configClass;

    Logger logger  = MyLogger.MyLogger(ZhouyuApplicationContext.class);


    public ZhouyuApplicationContext(Class configClass) {
        this.configClass = configClass;

        //在构造方法里面做扫描，如何扫描？
        // 扫描
        if(configClass.isAnnotationPresent(ComponentScan.class)){
            //获得传入类的CompontScan
            ComponentScan componentScanAnnotation = (ComponentScan) configClass.getAnnotation(ComponentScan.class);
            String path = componentScanAnnotation.value();

            if(logger.isDebugEnabled()){
                logger.debug("path is : " +path);
            }
            path = path.replace(".","/");

            ClassLoader classLoader =ZhouyuApplicationContext.class.getClassLoader();
            URL resource =classLoader.getResource(path);
            File file = new File(resource.getFile());

            if(file.isDirectory()){//判断文件是不是目录
                for (File listFile : file.listFiles()) {
                    //获取文件夹下的文件
                    String absolutePath  = listFile.getAbsolutePath();
                    System.out.println(absolutePath);
                    //将Class文件加载为class对象
                    Class<?> clazz = classLoader.loadClass(absolutePath);
                    // 判断有没有Component注解
                    if(clazz.isAnnotationPresent(Component.class)){


                    }
                }
            }


        }





    }


    public Object getBean(String beanName){

        return null;
    }



}
