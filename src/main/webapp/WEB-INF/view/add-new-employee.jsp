<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<form:form modelAttribute="employee" action="saveNewEmployee">

    <form:hidden path="id"/>

    <br><br>
    Name: <form:input path="name"/>
    <br><br>
    Surname: <form:input path="surname"/>
    <br><br>
    Department: <form:input path="department"/>
    <br><br>
    Salary: <form:input path="salary"/>
    <br><br>

    <input type="submit" name="OK">
</form:form>
</body>
</html>