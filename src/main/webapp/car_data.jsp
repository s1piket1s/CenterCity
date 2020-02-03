<%--
  Created by IntelliJ IDEA.
  User: jastin
  Date: 03.02.2020
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>renault</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/car" method="post">
    <input type="submit" name="button1" value="Get Data" />
    <input type="submit" name="button2" value="Clear!!!" />
</form>
${carText}

</body>
</html>
