package com.study.java1;

import org.junit.Test;

/**
 * 异常处理，抓抛模型
 *
 * 关于异常对象的产生，①系统自动生成的异常对象
 *                 ②手动的生成一个异常对象，并抛出(throw)
 *
 * 1.try-catch-finally
 * 2.throws
 *
 *
 * try-catch-finally的使用
 *
 * try{
 *     // 可能出现异常的代码
 * } catch(异常类型1 变量名) {
 *     // 处理异常的方式1
 * } catch(异常类型2 变量名2){
 *     // 处理异常的方式2
 * }
 * ...
 * finally{
 *     // 一定会执行的代码
 * }
 *
 * 1.finally是可选的
 * 2.使用try将可能出现异常代码包起来，在执行过程中，一旦出现异常，就会生成一个对应异常的类
 * 3.一旦try中的异常对象匹配到某一个catch，就进入catch中进行异常的处理，一旦处理完成
 *   就会跳出try-catch结构
 * 4.catch中的异常类型如果没有子父类关系，则谁声明在上，谁声明在下无所谓
 *   如果有子父类关系，则要求子类一定要声明在父类上面，否则报错
 * 5.常用的异常对象处理方法：String getMessage()        printStackTrace()
 * 6.在try结构中声明的变量，出了try后就不能用了
 */

public class ExceptionTest1 {
    @Test
    public void test(){
        String str = "123";
        str = "abc";
        try {
            int num = Integer.parseInt(str);
            System.out.println("hello--------1");
        } catch (NumberFormatException e){
//            System.out.println("出现数值转换异常了...");
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("出现异常");
        }

        System.out.println("hello--------2");

    }
}
