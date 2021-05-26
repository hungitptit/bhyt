<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>login</h1>
        <form action="LoginControl" method="post">
            Username: <input id="tvUserName" type="text" name="username" /> <BR>
            Password: <input id="txPassword" type="password" name="password" /> <BR>
            <input id="buttonLogin" type="submit" value="Login"/>
        </form>
    </body>
</html>