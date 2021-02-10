package com.company;


public class Main {
    public static void main(String[] arg) {
        System.out.println("Opdracht 1: for loop");
        for (int i=1; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("\n");
        System.out.println("Opdracht 2: while loop");
        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }

        System.out.println("\n");
        System.out.println("Opdracht 3: Math.random");
        float num = (float) (Math.random()*1);
        System.out.println(num);

        System.out.println("\n");
        System.out.println("Opdracht 4: Som van getallen");
        int sum = 0;
        for(int nmbr = 1; nmbr<=39; nmbr++){
            sum = sum + nmbr;
            System.out.println(sum);
        }

        System.out.println("\n");
        System.out.println("Opdracht 5: Math.random");
        for(i = 0; i <= 10; i++) {
            if ( i % 2 == 0 )
                System.out.println("s");
            else
                System.out.println("ss");
        }

        // Practicum 2A

        Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);
        System.out.println("BREEDTE: " + z1.getBreedte());
        System.out.println("LENGTE: " + z1.getLengte());
        System.out.println("DIEPTE: " + z1.getDiepte());
        System.out.println("BEREKENDE INHOUD: " + z1.inhoud());

        Zwembad z2 = new Zwembad();
        System.out.println("\n");
        z2.setBreedte(2.5);
        z2.setLengte(100.0);
        z2.setDiepte(2.0);
        double inh = z2.inhoud();
        System.out.println("GEGEVENS ZWEMBAD: " +z2.toString());
        System.out.println("BEREKENDE INHOUD: "+ z2.inhoud());

    }
}



