package cn.seven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author charon
 */
@SpringBootApplication
public class SevenApplication {

    public static void main(String[] args) {
        //启动springboot程序，启动内嵌的tomcat
        SpringApplication.run(SevenApplication.class, args);
    }

}
