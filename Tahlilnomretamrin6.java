
package com.mycompany.tahlilnomretamrin6;
import java.util.Scanner;
public class Tahlilnomretamrin6 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        double nomre;
        double majmo=0;
        
        double bishtarin=0;
        
         double kamtarin=20;
         
          int gabol=0;
          int momtaz=0;
          
           int kamtar=0;
           String nomreha = "";

        System.out.println(" tedad danshjo vardkonid" );
        
        int tedad= input.nextInt();
        
        while(tedad<=0){
            
            System.out.println("tedad drost vard konid");
            
            tedad=input.nextInt();
        }

         for(int i =1; i<=tedad; i++){

         System.out.println("nomredanshjo vard konid");
         
      nomre = input.nextDouble();
      
      while(nomre<0 || nomre>20){
          
            System.out.println("nomre drost vard konid");
            
           nomre = input.nextDouble();
           
        }

       nomreha = nomreha + nomre + " ";

       if(nomre>bishtarin){
            bishtarin = nomre;
        }

        if(nomre<kamtarin){
            kamtarin=nomre;
        }

        if(nomre>=10){
            gabol++;
        }

        if(nomre>=18){
            momtaz++;
        }

      majmo = majmo + nomre;
      
    }

        double miyangin = majmo / tedad;
        
        double darsad = gabol * 100.0 / tedad;
        

        Scanner vorodi = new Scanner(nomreha);
        

        while(vorodi.hasNextDouble()){
            
            nomre = vorodi.nextDouble();

            if(nomre < miyangin){
                
                kamtar++;
            }
        }

        System.out.println("majmo"+majmo);
        
        System.out.println("bishtarin"+bishtarin);
        
        System.out.println("kamtarin"+kamtarin);
        
        System.out.println("gabol"+gabol);
        
        System.out.println("momtaz"+momtaz);
        
        System.out.println("miyangin"+miyangin);
        
        System.out.println("kamtar"+kamtar);
        
        System.out.printf("darsad: %.2f%%%n", darsad);

    }
}
