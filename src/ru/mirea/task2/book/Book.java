package ru.mirea.task2.book;
import java.lang.*;

public class Book
{
    private String title;
    private String author;
    private int releaseDate;
    public int currentYear = 2021;
    //constructors
    public Book(String t, String a, int rd)
    {
        title = t;
        author = a;
        releaseDate = rd;
    }

    public Book(String t, String a)
    {
        title = t;
        author = a;
    }

    public Book(String t)
    {
        title = t;
        author = "is unknown";
    }

    public Book(String a, int rd)
    {
        author = a;
        releaseDate = rd;
    }
    //setters
    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setReleaseDate(int releaseDate)
    {
        this.releaseDate = releaseDate;
    }
    //getters
    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getReleaseDate()
    {
        return releaseDate;
    }

    public String toString()
    {
        return this.title + " by " + this.author + " " +
                (currentYear - this.releaseDate)+ " y.o.";
    }
}
