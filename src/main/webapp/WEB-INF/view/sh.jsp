<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<%= request.getContextPath() %>/resources/css/css.css" rel="stylesheet"type="text/css"/>
<script type="text/javascript" src="<%= request.getContextPath() %>/resources/js/jquery-1.8.2.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form:form action="/shz" method="post" modelAttribute="c">
		关键字:<form:input path="gjz"/><br>
		描述:<form:input path="ms"/><br>
		编号:<form:input path="id"/><br>
		公司名称:<form:input path="name"/><br>
		主营产品:<form:input path="cp"/><br>
		地址:<form:input path="dz"/><br>
		注册资本:<form:input path="zb"/><br>
		成立时间:<form:input path="date"/>
		年检日期:<input type="date" name="ndate"><br>
		年检状态<select name="zt">
			<option value="通过">通过</option>
			<option value="未通过">未通过</option>
			<option value="待定">待定</option>
		</select><br>
		备注:<form:input path="bz"/>
		<button>审核</button>
	</form:form>
</body>
<script type="text/javascript">
	var aa=${aa}
	if(aa>0){
		alert("审核成功")
		location="list"
	}else{
		alert("审核失败")
	}
</script>
</html>