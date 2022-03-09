package com.zp;

import com.zp.mapper.OrderMapper;
import com.zp.mapper.UdictMapper;
import com.zp.pojo.Order;
import com.zp.pojo.Udict;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    //注入mapper
    @Resource
    private OrderMapper orderMapper;
    @Resource
    private UdictMapper udictMapper;


    //======================测试水平分库=====================
    //添加操作
    @Test
    public void addCourseDb() {
        Order order = new Order();
        order.setSerial("order111");
        order.setAmount(new BigDecimal("111"));
        orderMapper.insert(order);
    }


    //查询操作
    @Test
    public void findCourseDb() {

        Order order = orderMapper.selectByPrimaryKey(1L);
        System.out.println(order);
    }
    //添加课程的方法
    @Test
    public void addCourse() {
        for(int i=1;i<=10;i++) {
            Order order = new Order();
            order.setSerial("java"+i);
            order.setAmount(new BigDecimal(i));
            orderMapper.insert(order);
        }
    }
    //=======================测试水平分表===================


    //======================测试公共表===================
    //添加操作
    @Test
    public void addDict() {
        Udict udict = new Udict();
        udict.setUstatus("a");
        udict.setUvalue("已启用");
        udictMapper.insert(udict);
    }
    //======================测试公共表===================


}
