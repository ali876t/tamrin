
package com.mycompany.khodpardaztamrin4;
import java.util.Scanner;
public class Khodpardaztamrin4 {

    public static void main(String[] args) {
        int exit = 0 ;
        int mojodi = 10000000;
        System.out.println("1 = mojodi");
        System.out.println("2 = variz");
        System.out.println("3 = bardahst");
        System.out.println("0 = exit");
        

        while (exit == 0 ){
       Scanner input = new Scanner(System.in);
        System.out.println("vard knid");
        int i= input.nextInt();
        if(i == 1){
                    System.out.println(mojodi);

        }
        
        if (i==2){
        System.out.println("mablag");
        int variz= input.nextInt();
         if(variz>=0){
               mojodi = mojodi + variz;
                                   System.out.println(mojodi);

         }else{
          System.out.println("mosbatvardkon");

         }
        }
        if (i==3){
             System.out.println("mablag");
             int bardahst= input.nextInt();
             int x = bardahst % 50000;
             if(bardahst>=0 && bardahst<=mojodi && x ==0){
                  mojodi=mojodi-bardahst;
                                      System.out.println(mojodi);

             }
             else{
                 System.out.println("adad ashtbah");
             }
          
        }
        
        
        
        
        
          if(i==0)
                  exit=1;  

        }
        
        
        
        
        }
        
      
        
       
       
    }

