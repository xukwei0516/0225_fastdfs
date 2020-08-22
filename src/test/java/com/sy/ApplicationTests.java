package com.sy;

import com.sy.utils.FastDFSClientWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

@SpringBootTest(classes = Application.class)
class ApplicationTests {

    @Autowired
    private FastDFSClientWrapper client;

    @Test
    void upload() throws Exception{
        File file = new File("D:\\statics\\imgs\\1.jpg");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        long fileSize = file.length();
        String url = client.uploadFile(bytes,fileSize ,"jpg");
        System.out.println(url);
        //fileInputStream.close();
    }

    @Test
    void download() throws Exception{
        String url = "group1/M00/00/00/wKhkdV9A3zGASDaxAAA_BWnbZFo078.jpg";
        byte[] bytes = client.downloadFile(url);
        System.out.println(Arrays.toString(bytes));
        FileOutputStream fileOutputStream = new FileOutputStream(new File("d:/2.jpg"));
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

}
