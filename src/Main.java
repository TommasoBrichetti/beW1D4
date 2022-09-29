import dipendente.Dipartimento;
import dipendente.Dipendente;
import dipendente.Livello;

import static dipendente.Dipartimento.PRODUZIONE;
import static dipendente.Livello.QUADRO;

public class Main {
    public static void main(String[] args) {

        Dipendente marriello = new Dipendente("mariello", 1, 30, QUADRO, PRODUZIONE);

        marriello.getInfo();
        getStipendioDipendente(marriello);
        schiavoperquanto(marriello, 6);
    }

    public static void getStipendioDipendente(Dipendente ist){
        System.out.println(ist.maquantomipagate());
    }
    public static void schiavoperquanto(Dipendente ist, int ore){
        System.out.println(ist.quantomischiavizzate() * ore + ist.maquantomipagate());
    }
}