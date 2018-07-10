<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>

<!DOCTYPE html>
<head>
<title></title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.0/themes/base/jquery-ui.css" />
<%-- <script src="<c:url value="/resources/js/common.js" />"></script> --%>
<script src="<c:url value="js/common.js" />"></script>
<script src="<c:url value="img/works/style.css" />"></script>

<script src="http://code.jquery.com/ui/1.10.0/jquery-ui.js"></script>

</head>
<%
    // 컨텍스트 메서드 호출
    String path = request.getContextPath();
%>
<script type="text/javascript">
$(document).ready(function(){
	
});

function goBtn01(){
    var comSubmit = new ComSubmit("commonForm");
    /* comSubmit.setUrl("<c:url value='/btn01.do' />"); */ 
    comSubmit.setUrl("<c:url value='/index.do' />"); 
    comSubmit.submit();
 
    
}
</script>

<body>
	<h1>다양한 홈페이지</h1>

<form id="commonForm" name="commonForm">
	<table>
		<%-- <thead>
			<tr>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>이름</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${memberList}" var="member">
				<tr>
					<td>${member.id}</td>
					<td>${member.pw}</td>
					<td>${member.name}</td>
					
				</tr>
			</c:forEach>
		</tbody> --%>
		<input type="hidden" id="id" name="id" value="1818">
<!-- 		<input type="button" id="btn01" name="btn01" value="버튼" onClick="goBtn01()">
		<input type="button" id="btn01" name="btn01" value="버튼" onClick="goBtn01()">
		<input type="button" id="btn01" name="btn01" value="버튼" onClick="goBtn01()"> -->
		<a href="http://chunxpd.cafe24.com/springTest/index.do/">moderna</a> <br>
		<a href="http://chunxpd.cafe24.com/ilsong">ilsong</a> <br>
		<a href="http://chunxpd.cafe24.com/isDesign">isDesign</a> <br>
	</table>
</form>	


</body>
</html>
