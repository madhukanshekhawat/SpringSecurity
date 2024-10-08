<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
    <h2>User Registration Form</h2>

    <form:form modelAttribute="user" method="POST" action="/user">
        <table>
            <tr>
                <td>Username:</td>
                <td><form:input path="username" /></td>
                <td><form:errors path="username"  /></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><form:input path="password" type="password" /></td>
                <td><form:errors path="password" /></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Register" />
                </td>
            </tr>
        </table>
    </form:form>

    <h3>${message}</h3>
</body>
</html>