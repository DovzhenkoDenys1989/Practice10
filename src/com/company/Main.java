package com.company;
/**
 *In the Main class, instances of classes are created, and also a check for the presence of an empty cell is performed.
 */
public class Main {


    public static void main(String[] args) {
        {
            System.out.println("Создается новый Фильм");
        }

Film film1 = new Film("Police Academy", "01:30", Film.COMEDY);
Film film2 = new Film("Game of Thrones", "01:00", Film.FANTASY);
Film film3 = new Film("Phantasm", "02:15", Film.HORROR);


//        Film[]films = {film1, film2, film3};
//        for (Film film : films){
//            System.out.println("Фильм " + film + ", успешно создан");
//        }
        Library library = new Library("Лучшие фильмы");
        System.out.println(library.returnArray());
        System.out.println(library.implementCheck("Sport1"));
        System.out.println(library.implementCheck("Sport2"));
        System.out.println(library.implementCheck("Sport3"));
        System.out.println(library.implementCheck("Sport4"));
    }
}
//        3 Создать класс Main c методом main.
//        В методе main создать экземпляр класса Library.
//        Запустить программу, проверить порядок вывода сообщений.
//        4 Написать метод, который находит первую пустую ячейку массива с фильмами и
//        возвращает индекс, если массив полностью заполнен возвращает -1.
//        4.1 В методе main реализовать проверку на наличие пустой ячейки и добавить в нее новый
//        фильм, если пустой ячейки уже нет – вывести сообщение: «Вы достигли лимита».
//        4.2 Запустить, проверить результат выполнения программы
//        4.3 Повторить шаги 4.1 - 4.2, пока не будет достигнут лимит.
//        5 Написать JavaDoc для классов и методов


