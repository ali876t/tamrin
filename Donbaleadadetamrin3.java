
package com.mycompany.donbaleadadetamrin3;
import java.util.Scanner;

public class Donbaleadadetamrin3 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("adad mosbat vard konid");
        int i= input.nextInt();
        int marahel=0;
        int maxadad=i;
        int zoj=0;
        int fard=0;
        while(true){
             if(i%2==0){
            i = i/2;
        }
        else{
            i=(i*3)+1;
        }
             marahel++;
             if(i>maxadad){
                 maxadad=i;
             }
             if(i%2==0){
                 zoj++;
             }
             else {
                 fard++;
             }
             if(i==1){
                 break;
             }      
             
        }
            System.out.println(marahel+"marahel");
             System.out.println(maxadad+"maxadad");
             System.out.println(zoj+"zoj");
             System.out.println(fard+"fard");
             
       
    }
}
