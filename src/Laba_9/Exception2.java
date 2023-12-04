package Laba_9;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try
        {
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        }

        catch (NumberFormatException e) {
            System.out.println("Нельзя преобразовать в целое числу ");
        }
        catch (ArithmeticException e)
        {
            System.out.println( "Нельзя делить на ноль ");
        }
        catch(Exception e){
            System.out.println("Общее исключение типа Exception");
        }

        finally {
            System.out.println("finally – определяет блок кода, который является необязательным, но при его " +
                    "наличии выполняется в любом случае независимо от результатов выполнения блока try.");
        }


    }

}
