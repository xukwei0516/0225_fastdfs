package com.sy;

import com.github.tobato.fastdfs.FdfsClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(FdfsClientConfig.class)
public class Application {

    public static void main(String[] args) {
        System.out.println("张三的编辑");
        System.out.println("李四的编辑");
        System.out.println("张三的第二次上传");
        System.out.println("张三的第三次上传");
         System.out.println("李四的第三次上传");
        SpringApplication.run(Application.class, args);
    }

}
