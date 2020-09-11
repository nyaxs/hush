package org.nyaxs.hush;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.nyaxs.hush.mapper")
public class HushApplication {

    public static void main(String[] args) {
        SpringApplication.run(HushApplication.class, args);
    }

}
