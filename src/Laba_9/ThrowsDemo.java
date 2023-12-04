package Laba_9;

/*
public class ThrowsDemo {
    public void getDetails(String key) {
        try
        {
            if(key == null)
            {
                throw new NullPointerException( "null key in getDetails" );
            }
        }
        catch ( NullPointerException e){
            System.out.println("Ошибка обработанная внутри метода: " + e.getMessage());
        }
        }
    }*/

   /* public class ThrowsDemo {
        public void printMessage(String key) {
            try {
                String message = getDetails(key);
                System.out.println(message);
            }
            catch (NullPointerException e){
                System.out.println("null key in getDetails");
            }
        }

        public String getDetails(String key) {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            return "data for" + key;
        }
    }*/


/*import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        try {
            printDetails( key );
        }
        catch (Exception e){
            System.out.println("Ошибка поймана" + e.getMessage() );
        }

    }
    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println( message );
        }
        catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key == "0") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }
}*/



import java.util.Scanner;

public class ThrowsDemo {
    public void getKey()  {
        Scanner myScanner = new Scanner( System.in );
        while (true) {
            try {
                System.out.print("Enter Key ");
                String key = myScanner.nextLine();
                printDetails(key);
                break;
            }
            catch (Exception e) {
                System.out.println("Поймана ошибка");
            }
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("0")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}






