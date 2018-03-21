<!DOCTYPE html>
<%@ page contentType="text/html;charset=utf-8" %>
<html lang="en">
<body>
<h2>Hello World!</h2>
<h2> ${data}</h2>

<form action="/">
    <label>
        <input id="log" name="login" type="text">${login}</input>
    </label>
    <label>
        <input id="pas" name="password" type="password" value="${password}">
    </label>
    <input type="submit">
</form>
</body>
</html>
