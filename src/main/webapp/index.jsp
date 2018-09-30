<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/29
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/mybatisTest02-1.0-SNAPSHOT/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        $(function () {

            var pageSize = "${pageInfo.pageSize}";
            var pageNumber = "${pageInfo.pageNumber}";
            var total = ${pageInfo.total};

            //查询按钮点击
            $("button").click(function () {
                location.href = "/queryInfo?pageSize=" + pageSize + "&pageNumber=1&tName=" + $(":text[name='tName']").val() + "&sName=" + $(":text[name='sName']").val();
            })
            //单选按钮点击
            $(":radio").click(function () {
                pageSize = $(this).val();
                location.href = "/queryInfo?pageSize=" + pageSize + "&pageNumber=1&tName=" + $(":text[name='tName']").val() + "&sName=" + $(":text[name='sName']").val();
            })
        });
    </script>
</head>
<body>
<input type="radio" value="2" name="pageSize">2
<input type="radio" value="3" name="pageSize">3
<input type="radio" value="4" name="pageSize">4
<br/>
学生姓名: <input type="text" name="sName"> 老师姓名:<input type="text" name="tName">
<button>查询</button>
<br/>
<table border="1">
    <tr>
        <th>编号</th>
        <th>学生姓名</th>
        <th>年龄</th>
        <th>任课老师</th>
    </tr>
    <c:forEach items="${pageInfo.list}" var="items">
        <tr>
            <td>${items.id}</td>
            <td>${items.name}</td>
            <td>${items.age}</td>
            <td>${items.teacher.name}</td>
        </tr>
    </c:forEach>
</table>

<a>上一页</a>
<a>下一页</a>
</body>
</html>
