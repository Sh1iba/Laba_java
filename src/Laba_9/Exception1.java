package Laba_9;

/////////////Листинг 1
public class Exception1 {
    public void exceptionDemo() {
        try{
            System.out.println( 2 / 0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Попытка деления на ноль");
        }
    }


}
