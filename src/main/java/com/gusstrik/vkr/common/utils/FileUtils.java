package com.gusstrik.vkr.common.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileUtils {
    public static InputStream getInputStream(String filePath) throws FileNotFoundException {
        if (filePath.contains("classpath:"))
            return Thread.currentThread()
                    .getContextClassLoader()
                    .getResourceAsStream(filePath.replace("classpath:/", "")
                            .replace("classpath:", ""));
        else
            return new FileInputStream(filePath);
    }
}
