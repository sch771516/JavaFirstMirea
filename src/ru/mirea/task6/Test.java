package ru.mirea.task6;

public class Test
{//принимает на вход объект интерфейса
    static void showData(Nameable obj)
    {
        System.out.println(obj.showInfo());
    }

    static Nameable createNameable(String name,int price, int option)
    {
        if(option == 1)
        {
            return new Journal(name, price);
        }
        else if (option == 2)
        {
            return new Book(name, price);
        }
        else
        {
            return null;
        }
    }
    public static void main(String[] args)
    {
        Nameable A = new Book("Garri Potter","Nikita Vosrikov",2020 );
        System.out.println(A.getName());
        Nameable B = new Journal("Hacking", 750);
        System.out.println(B.getName());
        A.setPrice(1050); B.setPrice(800);
        showData(A);showData(B);

        showData(createNameable("all about Japan", 500, 1 ));
    }
}
