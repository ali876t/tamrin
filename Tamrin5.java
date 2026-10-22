
package com.mycompany.tamrin5;
import java.util.Scanner;

public class Tamrin5 {

    public static void main(String[] args) {

        int exit = 0;
        
        int emtiaz = 100;
        
        int adad = 50;
        
        int[] hadsha = new int[7];
        Scanner input = new Scanner(System.in);

        while(exit < 7) {
            System.out.println("hads bezan");
            int hads = input.nextInt();

            int tekrar = 0;

            if(hads > 100 || hads < 1) {
                System.out.println("gabol nist");
            } else {

                for(int i = 0; i < exit; i++) {
                    if(hadsha[i] == hads) {
                        tekrar = 1;
                    }
                }

                if(tekrar== 1) {
                    emtiaz= emtiaz-15;
                    
                    System.out.println ("hads tekrar ast ");
                } else {
                    
                    hadsha [exit] =  hads ;

                    
                    if(hads != adad ) {
                        emtiaz = emtiaz - 10;

                        if(hads > adad) {
                            System.out.println("adad koochaktar ast");
                        }
                                else {
                            System.out.println("adad bozorgtar ast");
                        }
                        
                    } else {
                        System.out.println("dorost ast");
                        exit = 7;
                    }
                }

                if(emtiaz < 0) {
                    emtiaz = 0;
                }

                System.out.println(emtiaz);
            }

                exit++;
        }

        System.out.println("adad hadaf: " + adad);
        
        System.out.println("emtiaz nahayi: " + emtiaz);

    }
}
