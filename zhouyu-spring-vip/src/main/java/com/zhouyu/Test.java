package com.zhouyu;


import com.spring.ZhouyuApplicationContext;
import com.zhouyu.service.UserService;

public class Test {


    public static void main(String[] args) {

        // 扫描 ---- >  创建单例Bean
        ZhouyuApplicationContext applicationContext = new ZhouyuApplicationContext(AppConfig.class);

        UserService userService =(UserService) applicationContext.getBean("userService");


        userService.test();
    }


}
