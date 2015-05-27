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

//        int i = 0;
//
//        //Une boucle qui n'exécute qu'une instruction peut être sous le while sans acolade 
//        while (i == 10) {
//            i++;
//        }
//
//        //Un boucle qui exécuter plusieurs instruction doit être dans un bloc
//        while (i == 0) {
//            System.out.println(i);
//            i--;
//        }
//
//        //Un code peut ne jamais s'exécuter si la condition est fausse dès le départ
//        boolean faux = false;
//        while (faux) {
//            System.out.println("Never execute");
//        }
//
//        Boolean vrai = true;
//        while (vrai) {
//            System.out.println("Boucle infinie et objet Boolean autoboxer");
//        }
//
//        //Le for
//        //setup;condition;prepare for next time
//        for (int j = 0; j < 10; j++) {
//            System.out.println(j);
//        }
//
//        for (int j = 0; j < 10; j++) {
//            System.err.println(j);
//            System.out.println("next loop");
//        }
//
//        for (int j = 10; j < 10; j++) {
//            System.out.println("Never execute");
//        }
//
//        //Le setup
//        //La déclaration peut être multiple si c'est le même type
//        for (int x = 0, y = 10, z; x < y; x++) {
//            System.out.println(x);
//        }
//
//        //On peut aussi déclarer des tableaux graçe à leur déclaration particuliaire en deux temps
//        for (int x = 0, z = 10, y[] = new int[10],
//                b[][]; x < z; x++) {
//            System.out.println("Multiple initialisation");
//        }
//
//        //Ca ne marche pas avec des type différent
////        for(int x = 0, float z = 0; x == 0; x++){
////            System.out.println("Pas possible");
////        }
//        //Mais on peut manipuelr des type différent si ils sont déclarer avant
//        Object o;
//        for (i = 0, o = new Object(); i == 10; i++) {
//            System.out.println("DIfférent objet");
//        }
//
//        //Prepare for next step
//        //Incrémentation
//        for (int j = 0; j < 10; j++) {
//            System.out.println("Incrémentation");
//        }
//
//        //Décrémentation
//        for (int j = 10; j > 0; j--) {
//            System.out.println("Décrémentation");
//        }
//
//        //Invocation
//        for (int j = 0; j < 1000; j = Integer.MAX_VALUE) {
//            System.out.println("Invocation");
//        }
//
//        //Construction
//        for (Object a = null; a == null; a = new Object()) {
//            System.out.println("Construction");
//        }
//
//        //Mix
//        for (int j = 0; j < 10; j++, j--, i = Integer.MIN_VALUE, o = new Object()) {
//            System.out.println("Mix");
//        }

        //Ommision des sections
        boolean infini = true;
//        for (;;) {
//            System.out.println("Boucle infinie");
//        }
        
//        for(;infini;){
//            System.out.println("autant faire un whille");
//        }
        //Sans setup
//        int j = 0;
//        for(; j < 20; j++){
//            System.out.println("Sans setup");
//        }
//        
//        for(int nb = 0; nb ==1;){
//            System.out.println("Sans prepare for next step");
//        }
//        
//        //Sans condition
//        for(int nb = 0; ;nb =1){
//            System.out.println("Sans condition");
//        }
        
        //Equivalent d'un for avec un while
        //Un for
//        for(int k = 0; k < 10; k++){
//            System.out.println(k);
//        }
//        //Un while
//        {
//            int k = 0;
//            while(k < 10){
//                System.out.println(k);
//                k++;
//            }
//    
//        }
        //Do while
        //Contrairement au while mon test se fait à la fin
//        do{
//            System.out.println("Je m'exécute au moins une fois");
//        }while(false);
//        
//        //Le break
//        boolean condition = true;
//        while(condition){
//            condition = false;
//        }
//        
//        while(true){
//            break;
//        }
//        
        //Continue
//        boolean condition = true;
//        while(condition){
//            boolean flag = true;
//            if(condition){
//                flag = false;
//            }
//            if(condition && flag){
//                System.out.println("Je n'ai pas faire de continue");
//            }
//            break;
//        }
//        
//         while(condition){
//            boolean flag = false;
//            if(condition){
//                continue;
//            }
//            if(condition){
//                System.out.println("Je n'ai pas faire de continue");
//            }
//            break;
//        }
//         
         //Le label
//         while(true){
//             while(true){
//                 break;
//             }
//             System.out.println("boucle infini");
//         }
         
         myLabel : while(true){
             while(true){
                 System.out.println("Je casse ma boucle myLabel");
                 break myLabel;
             }
         }
         
         myLabel : while(true){
             while(true){
                 System.out.println("Je continue ma boucle myLabel");
                 continue myLabel;
             }
         }
    }

}
