package com.study.java;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author RenAshbell
 * @create 2022-04-12-15:17
 */
public class FiltUtilsTest {
    public static void main(String[] args) {
        File srcFile = new File("hello.txt");
        File destFile = new File("hello1.txt");
        try {
            FileUtils.copyFile(srcFile,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
