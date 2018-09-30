package com.tie.filter;

import com.tie.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/")
public class SqlSessionFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        filterChain.doFilter(servletRequest, servletResponse);

        sqlSession.close();
    }

    @Override
    public void destroy() {

    }
}
