package ru.mirea.task4;

public class TestAuthor
{
    public static void main(String[] args)
    {
        author p1 = new author("Nikita", "nik_vostrikov_03@mail.ru", 'M');
        author p2 = new author("Olya", "",  'F');
        p2.setEmail("ezgaynyy@yandex.com");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }


}
