<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<%= request.getContextPath() %>/resources/css/css.css" rel="stylesheet"type="text/css"/>
<script type="text/javascript" src="<%= request.getContextPath() %>/resources/js/jquery-1.8.2.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<form action="list" method="post">
	关键字:<input type="text" name="gjz" value="${v.gjz}">
	描述:<input type="text" name="ms" value="${v.ms}">
	<select>
		<option name="name" value="name">公司名称</option>
		<option name="cp"  value="cp">主营产品</option>
		<option name="dz" value="dz">公司地址</option>
	</select>
	<input type="text" name="nr" value="${nr}">
	注册资本:<input type="text" name="zb" value="${v.zb}">
		<input type="text" name="zb1" value="${v.zb1}">
	成立时间:<input type="date" name="date" value="${date}">
		  <input type="date" name="date1" value="${date1}">
		  <button>查询</button>
	<table>
		<tr>
			<td>编号</td>
			<td>关键字</td>
			<td>描述</td>
			<td>公司名称</td>
			<td>主营产品</td>
			<td>地址</td>
			<td>注册资本</td>
			<td>成立时间</td>
			<td>年间日期</td>
			<td>年间状态</td>
			<td>备注</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="li">
			<tr>
				<td>${li.id}</td>
				<td>${li.gjz}</td>
				<td>${li.ms}</td>
				<td>${li.name}</td>
				<td>${li.cp}</td>
				<td>${li.dz}</td>
				<td>${li.zb}</td>
				<td>${li.date}</td>
				<td>${li.ndate}</td>
				<td>${li.zt}</td>
				<td>${li.bz}</td>
				<td>
					<button type="button" onclick="xg(${li.id})">年检审核</button>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="100">
				<button name="page" value="${page}">${page}</button>	
				<button name="page" value="${page+1}">${page+1}</button>	
				<button name="page" value="${page+2}">${page+2}</button>	
				<button name="page" value="${page+3}">${page+3}</button>
				<input type="text" name="page" value="${page}">
				<button>跳转</button>	
			</td>
		</tr>
	</table>
</form>
</body>
<script type="text/javascript">
function xg(id) {
	location="sh?id="+id;
}
</script>
</html>