package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /* Realizuoti programą, kuri apskaičiuotų kiek automobilis vidutiniškai sunaudoja kuro 100
        km. Programa turi paprašyti vartotojo įvesti nuvažiuotus km ir kuro sąnaudas.
        vidurkis = (kuro sąnaudos *100)/ nuvažiuoto atstumo
    */
        float km, sanaudos;
        Scanner in = new Scanner(System.in);

        System.out.print("Iveskite nuvaziuotus kilometrus: ");
        km = in.nextFloat();
        System.out.print("Iveskite Kuro sanaudas: ");
        sanaudos = in.nextFloat();

        System.out.print("Vidurkis: " + (sanaudos * 100) / km);

    }
}
