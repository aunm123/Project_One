<%--
  Created by IntelliJ IDEA.
  User: timhuo
  Date: 2017/2/15
  Time: 上午11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<%--${pageContext.request.contextPath}/--%>
<link rel="stylesheet" type="text/css" href="/js/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="/js/themes/icon.css">
<script type="text/javascript" src="/js/jquery.min.js"></script>
<script type="text/javascript" src="/js/jquery.easyui.min.js"></script>
<head>
    <title>Title</title>
</head>
<body class="easyui-layout">
    <div title="给我滚-管理系统" data-options="region:'north'" style="height: 100px">北部区域</div>
    <div data-options="region:'west'" style="width: 200px;">西部区域</div>
    <div data-options="region:'center'">中心区域</div>
    <div data-options="region:'east'" style="width: 100px">东部区域</div>
    <div data-options="region:'south'" style="height: 50px">南部区域</div>
</body>
</html>

