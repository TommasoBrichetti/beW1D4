package dipendente;

import static dipendente.Livello.*;
 public class Dipendente {

    private static double stipendioBase = 1000;

    private static int matricola;

    private static double stipendio;

    private static String nome;

    private double importoOrario;

    private static Livello livello;

    private Dipartimento dipartimento;



    public Dipendente(int _matricola, Dipartimento _dipartimento){
        matricola = _matricola;
        dipartimento = _dipartimento;
        stipendio = stipendioBase;
        importoOrario = 30;
        livello = Livello.OPERAIO;
    }

    public Dipendente(String _nome, int _matricola, double _importoOrario,
                      Livello _livello, Dipartimento _dipartimento){
        nome = _nome;
        matricola = _matricola;
        importoOrario = _importoOrario;
        livello = _livello;
        dipartimento = _dipartimento;
        setStipendio();
    }

    private void setStipendio(){
        if(livello == DIRIGENTE){
            stipendio = stipendioBase * 2;
        } else if (livello == QUADRO) {
            stipendio = stipendioBase * 1.5;
        }else if (livello == IMPIEGATO) {
            stipendio = stipendioBase * 1.2;
        }else {stipendio = stipendioBase * 1;}
    }

    public void getInfo(){
        System.out.println( "nome: "+ nome);
        System.out.println( "dipartimento: "+ dipartimento);
        System.out.println( "livello: "+ livello);
        System.out.println( "stipendio: "+ stipendio);
        System.out.println( "importoOrario: "+ importoOrario);
        System.out.println( "matricola: "+ matricola);
    }

    public void promotion(){
        if(livello == DIRIGENTE){
            System.out.println("avidoooo");
            return;
        } else if (livello == QUADRO) {
            livello = DIRIGENTE;
        }else if (livello == IMPIEGATO) {
            livello = QUADRO;
        }else {livello = IMPIEGATO;}

        setStipendio();
        getInfo();
    }

     public double maquantomipagate(){
         return stipendio;
     }

     public double quantomischiavizzate(){
        return importoOrario;
     }










}
