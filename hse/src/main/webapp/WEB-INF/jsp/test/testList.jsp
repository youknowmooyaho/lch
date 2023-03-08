<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.12.4.min.js"></script>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
</head>
<body> 
<h1>테스트 페이지 </h1>
<button onclick="testGetUserList()">사용자 정보 가져오기 </button>
<button onclick="getEmcitt01()">hse 테이블 정보 가져오기 </button>
</body>
<script type="text/javascript">
function testGetUserList(){
	console.log("click")
	$.ajax({
		url:"testGetUserList",
		success: function(data){
			console.log("data : " , data);
		},error: function(err){
			console.log(err)
			alert("error");
		}
	})
}
function getEmcitt01(){
	$.ajax({
		url:"getEmcitt01",
		success: function(data){
			console.log("data : " , data);
		},error: function(err){
			console.log(err)
			alert("error");
		}
	})
}
</script>
</html>