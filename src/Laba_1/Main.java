package Laba_1;

///////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//---------------------------Сумма чисел массива c циклом for---------------------------//
/*
public class Main {
    public static void main(String[] args) {
        int [] arr = {10,3,6,4,2,4,6,3};
        int sum=0;
        for (int i = 0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма чисел массива = " + sum );
    }
}


/*

//---------------------------Сумма чисел массива c циклом while---------------------------//
public class Main {
    public static void main(String[] args) {
        int [] arr = new int[10];
        int sum=0;
        int k = 0;
        for (int i = 0; i<arr.length; i++) {
            arr[i]+=1;
        }
        while (k < arr.length)
        {
            sum+=arr[k];
            k++;
        }
        System.out.println("Сумма чисел массива = " + sum );
    }
}
*/


/*
//---------------------------Сумма чисел массива c циклом do while---------------------------//
public class Main {
    public static void main(String[] args) {
        int [] arr = new int[10];
        int sum=0;
        int k = 0;
        for (int i = 0; i<arr.length; i++) {
            arr[i]+=1;

        }
        do
        {
            sum+=arr[k];
            k++;
        }
         while (k < arr.length);
        System.out.println("Сумма чисел массива = " + sum );
    }
}
*/

//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//---------------------------аргументы командной строки---------------------------//


//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////


//---------------------------Сумма чисел гармонического ряда---------------------------//
/*
public class Main {
    public static void main(String[] args) {
        float chislo = 1;
        float sum = 0;
        int i = 0;
        while (i<10)
        {
            sum +=  chislo;
            chislo/=2;
            i++;
        }

        System.out.println("Сумма чисел гармонического ряда = " + sum );
    }
}

*/
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////

/*
//---------------------------Сортировка массива---------------------------//
public class Main {
    public static void main(String[] args) {
        int[] ar1 = new int[20];
        int temp = 0;
        System.out.print("Массив: ");
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = (int) (Math.random() * 100);
            System.out.print(ar1[i] + "  ");
        }
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1.length - 1; j++) {
                if (ar1[j] > ar1[j + 1]) {
                    temp = ar1[j];
                    ar1[j] = ar1[j + 1];
                    ar1[j + 1] = temp;
                }
            }

        }
        System.out.print("\nОтсортированный массив: ");

        for (int i = 0; i < ar1.length; i++) {

            System.out.print(ar1[i] + "  ");
        }
    }
}
*/

//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//---------------------------Факториал---------------------------//
/*
class factorial{
    static int calc_factorial(int n)
    {
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(calc_factorial(5));
    }
}

*/