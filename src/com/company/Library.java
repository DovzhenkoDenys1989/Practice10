package com.company;
/**
 * The class describes the fields, creates an initialization block in which an array is created for the field of the list of films.
 */
public class Library {
    public static void main(String[] args) {
    }
        private String[] films;
        private String nameLibrary;
        public static final String CONSTANTA = "Name";

        {
            this.films = new String[5];
            films[0] = "Крепкий орешек";
            films[1] = "Поезд в Пусан";
            System.out.println("Добавлены любимые фильмы");
        }

    public Library(String nameLibrary) {
            this.nameLibrary = nameLibrary;
            System.out.println("Библиотека " + nameLibrary + ", успешно создана.");
        }

        public String[] getFilms () {
            return films;
        }

        public static String getCONSTANTA () {
            return CONSTANTA;
        }

    /**
     * The method finds the first empty cell of the movies array and returns the index.
     * @return -1
     */
    public int returnArray(){
        for (int i = 0; i <films.length; i++) {
            if (films[i] == null)
                return i;
        }
        return -1;
}

    /**
     * @param film added movie.
     * @return added movie with index.
     */

public String implementCheck(String film) {
    int indexOfArray = returnArray();
    if (indexOfArray == -1) {
        return "Вы достигли лимита";
    } else {
        films [indexOfArray] = film;
        return "your film was added to cell with index: " + indexOfArray;
    }
}
}
//        2 Создать класс Library.
//        Описать поля: Массив из фильмов, название библиотеки.
//        Добавить блок инициализации в котором создается массив (с размером 5) для поля
//        списка фильмов.
//        2.1 Поле экземпляра класса «имя» пометить модификатором final.
//        2.2 Заполнить первые 2 элемента массива прямо в блоке инициализации. Создать 2 своих
//        любимых фильма, и добавить в массив.
//        2.3 Вывести сообщения на экран: “Добавлены любимые фильмы”
//        2.4 Добавить конструктор для класса Library, который принимает и инициализирует имя
//        библиотеки. Вывести сообщение на экран: «Библиотека “название”, успешно создана.»
//        2.5 Создать геттеры для полей имя и список фильмов.













