package com.example.avidea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AvideaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvideaApplication.class, args);
	}

}

</head>
<body>
<h1>AVIDEA></h1>
<h4>РЕГИСТРАЦИЯ<h4>
<form action>="registration" method="post">
Имя пользователя :<input type="text" name="name"><br><br>
Эл.почта :<input type>="email" name="email"><br><br>
Номер телефона :<input type>="text" name="phoneNumber"><br><br>
Пароль :<input type>="password" name="password"><br><br>
<input type>="hidden"
<input type>="submit"

spring.datasource.username=root