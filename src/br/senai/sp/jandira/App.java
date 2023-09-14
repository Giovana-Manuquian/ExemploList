package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Zebra;
import br.senai.sp.jandira.model.Zoo;

public class App {

    public static void main(String[] args) {

        Zebra objZebra = new Zebra();
        objZebra.cadastrarZebra();

        Zoo objZoo = new Zoo();
        objZoo.menu();
    }
}
