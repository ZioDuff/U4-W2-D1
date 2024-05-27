import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        **************** ES1 *******************
//        int[] arrOfNumbs = new int[5];
//
//        for (int i = 0; i < arrOfNumbs.length; i++) {
//            arrOfNumbs[i] = (int) (Math.random() * 10);
//
//        }
//        System.out.println(Arrays.toString(arrOfNumbs));
//
//        Scanner scanner = new Scanner(System.in);
//        int index = -1;
//        do {
//            System.out.println("scegli un numero da inserire nell'array");
//            int integerNum = Integer.parseInt(scanner.nextLine());
//            if (integerNum != 0) {
//                System.out.println("scegli prima un indice da 1 a 5 ");
//                index = Integer.parseInt(scanner.nextLine());
//                try {
//                    arrOfNumbs[index - 1] = integerNum;
//                    System.out.println(Arrays.toString(arrOfNumbs));
//} catch (ArrayIndexOutOfBoundsException e) {
//        System.err.println("indice non valido");
//                }
//                        } else {
//index = 0;
//        }
//
//
//        } while (index != 0);
//
//        scanner.close();


//        ************** ES2 *******************

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("inserisci i kilometri percorsi");
            double km = Double.parseDouble(scanner.nextLine());
            System.out.println("inserisci i litri consumati");
            double litri = Double.parseDouble(scanner.nextLine());
            double kmXLitri = km / litri;
            if (km == 0 || litri == 0) {
                throw new ArithmeticException("non puoi dividere per 0");
            } else System.out.println(kmXLitri);

        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());

        } catch (InputMismatchException e) {
            System.err.println("non hai inserito un numero");

        } finally {
            scanner.close();
        }
    }
}