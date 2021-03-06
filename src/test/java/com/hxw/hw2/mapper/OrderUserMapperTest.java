package com.hxw.hw2.mapper;

import com.hxw.hw2.entity.OrdersCustom;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class OrderUserMapperTest {
    private SqlSessionFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
    }

    @Test
    public void find() {
        SqlSession sqlSession = factory.openSession();
        OrderUserMapper mapper = sqlSession.getMapper(OrderUserMapper.class);
        List<OrdersCustom> list = mapper.find();
        for(OrdersCustom o : list){
            System.out.println(o);
        }
        sqlSession.close();
    }
}
