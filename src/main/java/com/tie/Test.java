package com.tie;

import com.tie.mapper.LogMapper;
import com.tie.model.Log;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        LogMapper mapper = session.getMapper(LogMapper.class);
//        List<Log> logs = mapper.select();
        List<Log> logs = mapper.selectByNo(null, "1");

        System.out.println(logs);
    }
}
