package Laba_2;

class Book {
    private String author;
    private String name;
    private int year;

    public Book(String author,String name,int year)
    {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String get_author()
    {
        return author;
    }
    public String get_name()
    {
        return name;
    }
    public int get_year()

    {
        return year;
    }

    public void change_author (String author){
        this.author = author;
    }
    public void change_name(String name){
        this.name = name;
    }
    public void change_year(int year){
        this.year = year;
    }
}
