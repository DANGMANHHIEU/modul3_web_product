<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1> Product </h1>
<form method="post" action="index">
    <label>Product Description: </label>
    <input type="text" name="description" placeholder="product" ><br/>
    <label> Price:</label>
    <input type="text" name="price" placeholder="price"><br/>
    <label>Discount Percent:</label>
    <input type="text" name="discount" placeholder="discount">
    <input type="submit" id="submit" value="Calculator">
</form>
</body>
</html>