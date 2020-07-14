package com.hxw.hw2.mapper;

import com.hxw.hw2.entity.OrdersCustom;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class OrderAndOrderDetailMapperTest {
    private SqlSessionFactory factory;

    @Before
    public void setUp() throws Exception{
        factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("sqlMapConfig.xml"));
    }

    @Test
    public void SelectOrderAndOrderDetailUser(){
        SqlSession sqlSession = factory.openSession();
        OrderAndOrderDetailMapper mapper = sqlSession.getMapper(OrderAndOrderDetailMapper.class);
        List<OrdersCustom> list = mapper.selectOrderANDOrderDetailUser();
        for (OrdersCustom ordersCustom : list){
            System.out.println(ordersCustom);
        }
        System.out.println(list.size());
        sqlSession.close();
    }
}
