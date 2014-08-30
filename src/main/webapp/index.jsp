<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Demo  RESTful webservice</h1>
        <ul>
            <li><a href="/SimpleRestful/res/srv/person">person</a></li>
            <li><a href="/SimpleRestful/res/srv/team">team</a></li>
        </ul>
        
        <form method="POST" action="/SimpleRestful/res/srv/person">
            
            naam:<input type="text" name="naam">
            age: <input type="text" name="age">
            <input type="submit" value="ok">
        </form>
    </body>
</html>
