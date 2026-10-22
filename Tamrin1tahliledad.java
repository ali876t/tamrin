
package com.mycompany.tamrin1tahliledad;
import java.util.Scanner;

public class Tamrin1tahliledad {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("adad sahih mosbat vard konid");
        int i= input.nextInt();
        int temp = i;
       int tedad=0;
       while(i>0){
           tedad++;
           i=i/10;
       }
       System.out.println(tedad+"tedad");
       i = temp;
       int majmo = 0;
       while (i > 0){
       int x = i %10;
       majmo = majmo+x;
       i=i/10;
       }
       System.out.println(majmo+"majmo");
       i = temp;
       int zarb =1;
       while(i>0){
           int r = i%10;
           zarb=zarb*r;
           i=i/10;
           
       }
    
       System.out.println(zarb+"zarb");
       i = temp;
       int bozorg =0;
       while(i>0){
           int u = i%10;
           if(u>bozorg){
               bozorg = u;
              
           }
            i=i/10;
       }
       System.out.println(bozorg+"bozorg");
       i = temp;
       
         int kochak =9;
       while(i>0){
           int o = i%10;
           if(o<kochak){
               kochak = o;
              
           }
            i=i/10;
       }
       System.out.println(kochak+"kochak");
       i = temp;
       
       int zoj =0;
       int fard=0;
       while(i>0){
           int r = i%10;
           if(r%2==0){
               zoj++;
           }
           else{
               fard++;
           }
           i = i/10;
       }
        System.out.println(zoj+"zoj");
        System.out.println(fard+"fard");
        i = temp;
         
         int makos=0;
        while(i>0){
            int r = i %10;
            makos = makos*10+r;
            i = i /10;
        }
         System.out.println(makos+"makos");
       
      
       
       
       
       
        
        
        
        
    }
}
