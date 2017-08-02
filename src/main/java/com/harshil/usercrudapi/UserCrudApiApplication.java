package com.harshil.usercrudapi;

import com.harshil.userdaoplugin.UserDaoPluginApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserCrudApiApplication {

	public static void main(String[] args) {
		Object[] sources = new Object[]{UserDaoPluginApplication.class, UserCrudApiApplication.class};
		String[] argstoUse = new String[]{"", ""};

		SpringApplication.run(sources, argstoUse);
	}
}
