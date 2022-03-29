package com.study.exer;

import org.junit.Test;

/**
 * @author RenAshbell
 * @create 2022-03-29 10:25
 */
public class StringDemo1 {
    /*
    获取一个字符串在另一个字符串中出现的次数。
     */

    /**
     * 获取subStr在mainStr出现的次数
     * @param mainStr
     * @param subStr
     * @return
     */
    public int getCount(String mainStr,String subStr){
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;
        if(mainLength >= subLength){
            // 方式一
//            while ((index = mainStr.indexOf(subStr)) != -1){
//                count++;
//                mainStr = mainStr.substring(index + subLength);
//            }
            // 方式二
            while ((index = mainStr.indexOf(subStr,index)) != -1){
                count++;
                index += subLength;
            }
            return count;
        } else {
            return 0;
        }
    }

    @Test
    public void test1(){
        String mainStr = "abcedfgwabwasdabsdwdwa";
        String subStr = "ab";

        int count = getCount(mainStr, subStr);
        System.out.println(count);
    }

}
