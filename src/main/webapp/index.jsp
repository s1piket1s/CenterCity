<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>firs_title</title>
</head>
<body>
${textA}
${textB}

<form name="form1" method="post" action="post.php">
    Введите текст:<br />
    <textarea name="text" cols="80" rows="10"></textarea>
    <input name="" type="submit" value="Отправить"/>
</form>

</body>
</html>
