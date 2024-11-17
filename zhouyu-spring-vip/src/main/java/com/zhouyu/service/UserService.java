package com.zhouyu.service;


import com.zhouyu.util.MyLogger;
import org.apache.log4j.Logger;

public class UserService {

    Logger logger  = MyLogger.MyLogger(UserService.class);


     public void test(){
        logger.isDebugEnabled();
        logger.debug("test");
     }


}
