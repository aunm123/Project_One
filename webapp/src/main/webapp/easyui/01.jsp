<%--
  Created by IntelliJ IDEA.
  User: timhuo
  Date: 2017/2/15
  Time: 上午11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
<head>
    <title>Title</title>
</head>
<body class="easyui-layout">
<div title="tabs-管理系统" data-options="region:'north'" style="height: 100px">北部区域</div>
<div title="系统菜单" data-options="region:'west'" style="width: 200px;">
    <div class="easyui-accordion" data-options="fit:true">
        <div title="面板1">
            <a class="easyui-linkbutton" onclick="doAdd();">百度</a>
            <script type="text/javascript">
                function doAdd() {
                    //动态添加选项卡
                    if($('.easyui-tabs').tabs('exist'))
                    $('.easyui-tabs').tabs('add',{
                        title:'这是动态添加标题',
                        content:'这是动态添加内容',
                        closable:true,
                        iconCls:'icon-edit',
                    })
                }
            </script>
        </div>
        <div title="面板2">test2</div>
        <div title="面板3">test3</div>
        <div title="面板4">test4</div>
    </div>
</div>
<div data-options="region:'center'">
    <div class="easyui-tabs" data-options="fit:true">
        <div title="面板1" data-options="closable:true,iconCls:'icon-edit'">test1</div>
        <div title="面板2">test2</div>
        <div title="面板3">test3</div>
        <div title="面板4">test4</div>
    </div>
</div>
<div data-options="region:'east'" style="width: 100px">东部区域</div>
<div data-options="region:'south'" style="height: 50px">南部区域</div>
</body>
</html>
















