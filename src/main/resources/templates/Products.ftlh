<!DOCTYPE  html>
<html>
<head>
<title>BUYSELL</title>
</head>
<body>
<h1>Hello, BUYSELL!</h1>
<h3>Товары со всей России</h3>
<#list products as product>
<div>
<p><b>${product.title}</b> ${product.price} руб. | <a href="/product/${product.id}">Подробнее...</a></p>
</div>
</#list>
<hr>
<h3>Создать новый товар</h3>
<form action="/product/create" method="post">
Название объявления: <input type="text" name="title"/><br><br>
Описание объявления: <input type="text" name="description"/><br><br>
Цена: <input type="number" name="price"/><br><br>
Город: <input type="text" name="city"/><br><br>
Имя: <input type="text" name="author"/><br><br>
<input type="submit" value="Добавить товар"/>
</form>
</body>
</html>