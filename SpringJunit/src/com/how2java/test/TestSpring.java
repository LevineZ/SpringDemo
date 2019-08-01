package com.how2java.test;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 
import com.how2java.pojo.Category;
 
@RunWith(SpringJUnit4ClassRunner.class)//表示这是一个Spring的测试类
@ContextConfiguration("classpath:applicationContext.xml")//定位Spring的配置文件
public class TestSpring {
    @Autowired                                //给这个测试类装配Category对象
    Category c;
 
    @Test                                    //测试逻辑，打印c对象的名称
    public void test(){
        System.out.println(c.getName());
    }
}