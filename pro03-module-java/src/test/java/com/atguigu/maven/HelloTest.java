package com.atguigu.maven;/*
@Author Wzi
@Create_Date 2019/10/4 15:09
*
*/

import org.junit.Test;

public class HelloTest {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        hello.showMessage();
    }
}
