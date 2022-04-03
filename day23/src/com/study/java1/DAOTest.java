package com.study.java1;

import org.junit.Test;

import java.util.List;

/**
 * @author RenAshbell
 * @create 2022-04-03-17:42
 */
public class DAOTest {

    @Test
    public void test1(){
        CustomerDao dao1 = new CustomerDao();

        dao1.add(new Customer());
        List<Customer> list = dao1.getForList(10);

        StudentDAO dao2 = new StudentDAO();
        Student student = dao2.getIndex(1);
    }
}
