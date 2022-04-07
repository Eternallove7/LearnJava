package com.study.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author RenAshbell
 * @create 2022-04-07-20:37
 */
public class MyInput {
    public static String readString(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = "";
        try {
            string = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return string;
        }
    }

    public static int readInt(){
        return Integer.parseInt(readString());
    }

}
