package ru.lab;

import lombok.AllArgsConstructor; // Импортируем аннотацию для конструктора со всеми параметрами
import lombok.Data; // Импортируем аннотацию для генерации стандартных методов (геттеры, сеттеры, toString, equals, hashCode)
import lombok.NoArgsConstructor; // Импортируем аннотацию для конструктора без параметров

@Data // Генерирует геттеры, сеттеры, toString(), equals() и hashCode() с помощью Lombok
@NoArgsConstructor // Создает конструктор по умолчанию без параметров
@AllArgsConstructor // Создает конструктор с параметрами (phoneNumber, message), чтобы удобно создавать объекты в Stream API
public class SmsMessage { // Объявляем класс ru.lab.SmsMessage (SMS-сообщение)

    private String phoneNumber; // Поле для хранения номера телефона получателя

    private String message; // Поле для хранения текста SMS-сообщения
}
