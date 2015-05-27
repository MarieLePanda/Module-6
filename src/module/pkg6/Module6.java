/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module.pkg6;

/**
 *
 * @author Lucas
 */
public class Module6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i = 0;

        //Une boucle qui n'exécute qu'une instruction peut être sous le while sans acolade 
        while (i == 10) {
            i++;
        }

        //Un boucle qui exécuter plusieurs instruction doit être dans un bloc
        while (i == 0) {
            System.out.println(i);
            i--;
        }

        //Un code peut ne jamais s'exécuter si la condition est fausse dès le départ
        boolean faux = false;
        while (faux) {
            System.out.println("Never execute");
        }

        Boolean vrai = true;
        while (vrai) {
            System.out.println("Boucle infinie et objet Boolean autoboxer");
        }

        //Le for
        //setup;condition;prepare for next time
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        for (int j = 0; j < 10; j++) {
            System.err.println(j);
            System.out.println("next loop");
        }

        for (int j = 10; j < 10; j++) {
            System.out.println("Never execute");
        }

        //Le setup
        //La déclaration peut être multiple si c'est le même type
        for (int x = 0, y = 10, z; x < y; x++) {
            System.out.println(x);
        }

        //On peut aussi déclarer des tableaux graçe à leur déclaration particuliaire en deux temps
        for (int x = 0, z = 10, y[] = new int[10],
                b[][]; x < z; x++) {
            System.out.println("Multiple initialisation");
        }

        //Ca ne marche pas avec des type différent
//        for(int x = 0, float z = 0; x == 0; x++){
//            System.out.println("Pas possible");
//        }
        //Mais on peut manipuelr des type différent si ils sont déclarer avant
        Object o;
        for (i = 0, o = new Object(); i == 10; i++) {
            System.out.println("DIfférent objet");
        }

        //Prepare for next step
        //Incrémentation
        for (int j = 0; j < 10; j++) {
            System.out.println("Incrémentation");
        }

        //Décrémentation
        for (int j = 10; j > 0; j--) {
            System.out.println("Décrémentation");
        }

        //Invocation
        for (int j = 0; j < 1000; j = Integer.MAX_VALUE) {
            System.out.println("Invocation");
        }

        //Construction
        for (Object a = null; a == null; a = new Object()) {
            System.out.println("Construction");
        }

        //Mix
        for (int j = 0; j < 10; j++, j--, i = Integer.MIN_VALUE, o = new Object()) {
            System.out.println("Mix");
        }

        //Ommision des sections
        for (;;) {
            System.out.println("Boucle infinie, autant faire un whille");
        }

    }

}
