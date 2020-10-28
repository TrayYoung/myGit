package com.jxd.comment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName cmtApplication
 * @Description TODO
 * @Author GengYang
 * @Date 2020/10/28
 * @Version 1.0
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.jxd")
@MapperScan("com.jxd.comment.mapper")
public class cmtApplication {
    public static void main(String[] args) {
        SpringApplication.run(cmtApplication.class);//
    }
}
