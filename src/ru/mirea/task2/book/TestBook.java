package ru.mirea.task2.book;
import java.lang.*;

public class TestBook
{
    public static void main(String[] args)
    {
        Book b1 = new Book("Гарри Поттер и узник Азкабана","Джоан Роулинг",2019);
        Book b2 = new Book("Зелёная миля","Стивен Кинг");
        b2.setReleaseDate(2020);
        Book b3 = new Book("Унесённые ветром");
        b3.setReleaseDate(2020); b3.setAuthor("Маргарет Митчелл");
        Book b4 = new Book("Кэтрин Скотт",2016);
        b4.setTitle("Прислуга");

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println(b4.toString());
    }
}
