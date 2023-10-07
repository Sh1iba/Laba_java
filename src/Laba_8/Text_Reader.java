package Laba_8;
import java.io.*; // импорт пакета java.io, который содержит классы для работы с вводом и выводом данных.

public class Text_Reader {
    public static void main(String[] args){
                try(FileWriter writer = new FileWriter("file.txt"))//начало блока try с созданием объекта FileWriter для записи в файл "file.txt".
                {
                    // запись всей строки
                    String text = "Если черти в душе гнездились, значит ангелы жили в ней";
                    writer.write(text); //запись строки в файл.
                }
                catch(IOException ex){ //обработка возможного исключения типа IOException, вывод сообщения об ошибке в случае исключения.
                    System.out.println(ex.getMessage());
                }

        try(FileReader reader = new FileReader("file.txt")) //начало блока try с созданием объекта FileReader для чтения из файла "file.txt".
        {
            // читаемпосимвольно
            int c;
            while((c=reader.read())!=-1){ //чтение файла посимвольно и вывод символов в консоль.
                System.out.print((char)c);
            }
            System.out.print("\n");
        }
        catch(IOException ex){ //обработка возможного исключения типа IOException, вывод сообщения об ошибке в случае исключения.
            System.out.println(ex.getMessage());
        }
    }
}


