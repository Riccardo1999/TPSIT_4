package areaperimetrotriangolo;

import java.util.Scanner;

public class AreaPerimetroTriangolo {

    public static void main(String[] args) {
        int lati[] = new int[3];
        int area;
        int lmax;
        int stato;
        int somma;
        int max;
        int x;

        Scanner input = new Scanner(System.in);
        max=0;
        somma=0;
        do {
            stato=0;
            for (x = 0; x < 3; x++) {

                do {
                    System.out.print("Inserire il " + (x + 1) + " lato del triangolo: ");
                    lati[x] = input.nextInt();
                } while (lati[x] < 1);
                if (lati[x] > max) {
                    max = x;
                }
            }
            for (x = 0; x < 3; x++) {
                if (x != max) {
                    somma = somma + lati[x];
                }
            }
            lmax=lati[max];
            if (lmax > somma) {
                stato = 1;
            }
        } while (stato == 1);
        
        somma = lati[0] + lati[1] + lati[2];
        System.out.println("\nPerimetro: " + somma);
        
        somma=somma/2;
        area=somma*(somma-lati[0])*(somma-lati[1])*(somma-lati[2]);
        area=(int)Math.sqrt(area);
        System.out.println("\nArea: " + area);
    }
}
