package ru.lab;

import lombok.AllArgsConstructor; // Импортируем аннотацию для конструктора со всеми полями
import lombok.Data; // Импортируем аннотацию для генерации геттеров, сеттеров, equals, hashCode и toString
import lombok.NoArgsConstructor; // Импортируем аннотацию для пустого конструктора

import java.util.List; // Импортируем интерфейс List для хранения списка любимых книг

@Data // Автоматически генерирует геттеры, сеттеры, toString(), equals() и hashCode()
@NoArgsConstructor // Генерирует пустой конструктор, необходимый библиотеке Gson для десериализации JSON
@AllArgsConstructor // Генерирует конструктор со всеми аргументами
public class Visitor { // Объявляем класс ru.lab.Visitor (Посетитель библиотеки)

    private String name; // Поле для хранения имени посетителя (ключ "name" в JSON)

    private String surname; // Поле для хранения фамилии посетителя (ключ "surname" в JSON)

    private String phone; // Поле для хранения номера телефона посетителя (ключ "phone" в JSON)

    private List<Book> favoriteBooks; // Список объектов ru.lab.Book — избранные книги посетителя (ключ "favoriteBooks" в JSON)

    private boolean subscribed; // Флаг подписки на рассылку: true — подписан, false — не подписан (ключ "subscribed" в JSON)
}
