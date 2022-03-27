package com.study.java2;

public class StudentTest {
    public static void main(String[] args) {
        try {
            Student s = new Student();
            s.regist(-1001);
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Student{
    private int id;
    public void regist(int id) throws RuntimeException{
        if (id > 0){
            this.id = id;
        } else {
//            System.out.println("数据非法");
            // 手动抛出异常对象
//            throw new RuntimeException("数据非法！");
            throw new MyException("数据非法！");
        }
    }

    public void test() throws Exception {
//        throw new RuntimeException("1");
        throw new Exception("1");
    }
}