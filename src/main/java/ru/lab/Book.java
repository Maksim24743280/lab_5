package ru.lab;

import lombok.AllArgsConstructor; // Импортируем аннотацию Lombok для создания конструктора со всеми параметрами
import lombok.Data; // Импортируем аннотацию Lombok для генерации геттеров, сеттеров, toString, equals и hashCode
import lombok.NoArgsConstructor; // Импортируем аннотацию Lombok для создания пустого конструктора (нужен для работы Gson)

@Data // Генерирует геттеры, сеттеры, методы toString(), equals() и hashCode() (важно для фильтрации дубликатов через distinct())
@NoArgsConstructor // Создает конструктор без аргументов, чтобы библиотека Gson могла создать экземпляр класса при чтении JSON
@AllArgsConstructor // Создает конструктор со всеми полями для удобного создания объектов вручную при необходимости
public class Book { // Объявляем класс ru.lab.Book (Книга)

    private String name; // Поле для хранения названия книги (совпадает с ключом "name" в books.json)

    private String author; // Поле для хранения имени автора книги (ключ "author" в JSON)

    private int publishingYear; // Поле для хранения года издания книги (ключ "publishingYear" в JSON)

    private String isbn; // Поле для хранения уникального номера книги ISBN (ключ "isbn" в JSON)

    private String publisher; // Поле для хранения названия издательства (ключ "publisher" в JSON)
}
