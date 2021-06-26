<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>index</title>
        </head>

        <body>
            <form:form method="POST" action="/updateUser" modelAttribute="updateModel">

                <label>ID: </label>
                <input type="text" id="id" name="id" value="${updateModel.id}"><br>

                <label>Username: </label>
                <input type="text" id="username" name="username" value="${updateModel.username}"> <br>

                <label>Password: </label>
                <input type="text" id="password" name="password" value="${updateModel.password}"> <br>

                <label>Address: </label>
                <input type="text" id="address" name="address" value="${updateModel.address}"> <br>

                <input type="submit" value="Save">

            </form:form>

        </body>

        </html>