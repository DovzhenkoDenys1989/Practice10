package com.company;
/**
 * The class describes the fields, creates a constructor with parameters, getters and setters.
 * Adding constant genre fields.
 */
public class Film {
    private String name;
    private Film[]films;
    private String duration;
    private String genre;

    public Film(String name, String duration, String genre) {
        System.out.println("Создается новый фильм");
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        System.out.println("Фильм " +  name + ", успешно создан");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static final String COMEDY = "COMEDY";
    public static final String FANTASY = "FANTASY";
    public static final String HORROR = "HORROR";

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
//        1 Создание класса с блоком инициализации
//        1.1 Создать класс Film. Описать поля: Название, продолжительность, жанр. Создать
//        конструктор с параметрами, геттеры и сеттеры.
//        1.2 Добавить константные поля жанров, например: комедия, фантастика, ужасы.
//        Примечание, для создания экземпляра класса Film, пользоваться этими константами.
//        1.3 Добавить блок инициализации в котором вывести на экран сообщение: «Создается
//        новый Фильм».
//        В конструкторе добавить вывод на экран сообщение: «Фильм “название”, успешно
//        создана.»
