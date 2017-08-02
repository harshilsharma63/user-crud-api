package com.harshil.usercrudapi.web.config;

import com.harshil.userdaoplugin.dao.UserDao;
import com.harshil.userdaoplugin.dao.UserDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public UserDao userDao() {
        return new UserDaoImpl();
    }
}
