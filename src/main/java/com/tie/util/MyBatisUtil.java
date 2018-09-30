package com.tie.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisUtil {

    private static SqlSessionFactory factory;

    private static ThreadLocal<SqlSession> sessionTl = new ThreadLocal<>();

    static {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            factory = new SqlSessionFactoryBuilder().build(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession() {
        SqlSession session = sessionTl.get();
        if (session != null) {
            return session;
        }else {
            session = factory.openSession();
            sessionTl.set(session);
            return session;
        }
    }

    public static void closeSqlSession() {
        SqlSession session = sessionTl.get();
        if (session != null) {
            session.close();
        }
    }
}
