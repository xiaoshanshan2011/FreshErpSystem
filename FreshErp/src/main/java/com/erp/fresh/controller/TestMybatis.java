package com.erp.fresh.controller;

import com.erp.fresh.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Reader;
import java.util.logging.Logger;

@Controller
@RequestMapping("/test")
public class TestMybatis {

    @RequestMapping("haha")
    @ResponseBody
    private User haha() {
        String resource = "mybatis-config.xml";
        Reader reader = null;
        SqlSession sqlSession = null;
        Logger logger = null;
        try {
            logger = Logger.getLogger(TestMybatis.class.getName());
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = factory.openSession();
            User user = sqlSession.selectOne("findById", 1);
            logger.info(user.toString());
            sqlSession.commit();
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            sqlSession.close();
        }
    }

}
