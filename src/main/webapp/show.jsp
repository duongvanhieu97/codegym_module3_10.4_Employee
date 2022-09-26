<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>EmployeeList</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h1>Employee List</h1>
    <table>
        <tr>
            <th>Name</th>
            <th>Date</th>
            <th>Address</th>
            <th>Image</th>
        </tr>
        <c:forEach items = "${employeeList}" var = "employee">
            <tr>
                <td><c:out value="${employee.getName()}"></c:out></td>
                <td><c:out value="${employee.getDate()}"></c:out></td>
                <td><c:out value="${employee.getAddress()}"></c:out></td>
                <td><img class="avatar" src="<c:out value="${employee.getImage}"></c:out>"> </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>