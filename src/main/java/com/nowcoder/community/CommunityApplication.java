package com.nowcoder.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommunityApplication {

	public static void main(String[] args) {

		SpringApplication.run(CommunityApplication.class, args);  // 创建Spring容器，扫描配置类所在的包和子包下的Bean。Bean需要有注解才能被扫描。

	}

}
