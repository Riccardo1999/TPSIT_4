package areaperimetrotriangolo;

import java.util.Scanner;

public class AreaPerimetroTriangolo {

    public static void main(String[] args) {
        int lati[] = new int[3];
        int latomax;
        int latomin;
        int altezza;
        float area;
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
        
        lmax=lmax/2;
        if(0==max){
            if(lati[1]>lmax){
                latomax=lati[1];
                latomin=max;
            }else{
                latomax=max;
                latomin=lati[1];
            }
        }else{
            if(lati[0]>lmax){
                latomax=lati[0];
                latomin=max;
            }else{
                latomax=max;
                latomin=lati[0];
            }
            
        }
        altezza=(latomax*latomax)+(latomin*latomin);
        altezza=(int)Math.sqrt(altezza);
        area=((lmax*2)*altezza)/2;
        somma = lati[0] + lati[1] + lati[2];
        System.out.println("\nPerimetro: " + somma);
        System.out.println("\nArea: " + area);
    }
}
