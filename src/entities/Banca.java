package entities;

import exceptions.BancaException;

public class Banca {
    public static void main(String args[]) {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 150);

        System.out.println("Saldo conto: " + conto1.restituisciSaldo());

        try {

            conto1.preleva(1750.5);

            System.out.println("Saldo conto: " + conto1.restituisciSaldo());
            throw new BancaException("Errore durante il prelievo: ");
        } catch (BancaException e) {
            System.out.println(e.getMessage() + e);
            e.printStackTrace();
        }

        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);

        conto2.stampaSaldo();
        conto2.preleva(2000);


        try {
            conto2.preleva(2000);

            conto2.stampaSaldo();
            throw new BancaException("Errore durante il prelievo: ");

        } catch (BancaException e) {
            System.out.println(e.getMessage() + e);
            e.printStackTrace();
        }
    }
}

