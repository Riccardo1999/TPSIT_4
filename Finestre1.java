package finestre1;

import java.util.Scanner;

public class Finestre1 {
    
    public static void main(String[] args) {
        Finestra f;
        int numero;
        int x;
        
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Inserire il numero di finestre che si vogliono aprire");
            numero = input.nextInt();
        } while ((numero < 1) || (numero > 100));
        for (x = 0; x < numero; x++) {
            f = new Finestra();
            f.setVisible(true);
            f.testo.setText("Sono la " + (x + 1) + " finestra.");
            f.setLocation((50 + x * 50), (50 + x * 50));
            f.setTitle((x + 1) + " finestra");
        }
    }
}
