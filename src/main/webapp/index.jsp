<%--
Created by IntelliJ IDEA.
User: Van Hop
Date: 9/27/2021
Time: 2:17 PM
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
    <style type="text/css">
        .convert {
            height: 180px;
            width: 230px;
            margin: 0;
            padding: 10px;
            border: 1px #CCC solid;
        }

        .convert input {
            padding: 5px;
            margin: 5px
        }
    </style>
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="/convert" method="post" class="convert">
    <label>Product Description: </label>
    <input type="text" name="productDescription" placeholder="Aa"><br>
    <label>List Price: </label>
    <input type="text" name="listPrice" placeholder="Aa"><br>
    <label>Discount Percent: </label>
    <input type="text" name="discountPercent" placeholder="Aa"><br>
    <input type="submit" value="Calculate Discount">
</form>
</body>
</html>
