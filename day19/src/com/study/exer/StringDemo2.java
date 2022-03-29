package com.study.exer;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author RenAshbell
 * @create 2022-03-29 10:50
 */
public class StringDemo2 {
    /*
    获取两个字符串中最大相同子串。比如
    str1 = "abcwerhelloyuoi";str2 = "cvhellobnm"
    提示：将短的那个串进行长度依次递减的子串与较长的串比较
     */

    // 前提：两个字符串中只有一个最大相同子串
    public String getMaxSameString(String str1,String str2){
        if (str1 != null && str2 != null){
            String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String minStr = (str1.length() < str2.length()) ? str1 : str2;
            int length = minStr.length();

            for (int i = 0;i < length;i++){

                for (int x = 0,y = length - i;y <= length;x++,y++) {
                    String substr = minStr.substring(x,y);
                    if (maxStr.contains(substr)){
                        return substr;
                    }
                }

            }

        }
        return null;
    }

    @Test
    public void test2(){
        String str1 = "abcwadshhaffsafwasdhello2ff";
        String str2 = "wasdaffsa1hello2";

        String maxSameString = getMaxSameString(str1, str2);
        System.out.println(maxSameString);
    }

    // 如果存在多个长度相同的最大相同子串
    public String[] getMaxSameString1(String str1,String str2){
        if (str1 != null && str2 != null){
            StringBuffer sb = new StringBuffer();
            String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String minStr = (str1.length() < str2.length()) ? str1 : str2;
            int length = minStr.length();

            for (int i = 0;i < length;i++){

                for (int x = 0,y = length - i;y <= length;x++,y++) {
                    String substr = minStr.substring(x,y);
                    if (maxStr.contains(substr)){
                        sb.append(substr + ",");
                    }
                }
//                System.out.println(sb);
                if (sb.length() != 0){
                    break;
                }
            }
            String[] split = sb.toString().replaceAll(",$","").split("\\,");
            return split;

        }
        return null;
    }

    @Test
    public void test3(){
        String str1 = "abcwasdaffdshhaffsafwasdhello22ff";
        String str2 = "wasdaffsa1hello22";


        String[] maxSameString = getMaxSameString1(str1, str2);
        System.out.println(Arrays.toString(maxSameString));
    }
}
