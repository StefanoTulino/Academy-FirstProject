package com.corso.git0;

public class TestAereo {

    //vedere meglio una cosa
    public static void main(String[] args) {
        AereoMobile a1=new Alianti("Primo",100);
        AereoMobile a2=new Alianti("Secondo",130);

        AereoMobile a3=new AereoMotore("Mobile0",150.30);
        //NB. per richiamare il get di AereoMotore devo fare per forza un casting cosi
        System.out.println("Potenza dell'aereoMotore:"+ ((AereoMotore) a3).getPotenza() );

        int risultato= a1.compareToAir(a2);
        switch (risultato){
            case 1: System.out.println("Il primo aliante ha una efficienza maggiore");break;
            case -1: System.out.println("Il secondo aliante ha una efficienza maggiore");break;
            case 0: System.out.println("I due alianti hanno una efficienza uguale");break;
            case -2: System.out.println("L'oggetto passato non è di tipo Aliante");break;
            default: ;
        }

    }
}
