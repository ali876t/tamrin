
package com.mycompany.tashkhisadadavaltamrin2;
import java.util.Scanner;


public class Tashkhisadadavaltamrin2 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("adad aval vard konid");
        int i= input.nextInt();
        int tedadmakhsom=0;
        for(int j =1; j<=i;j++){
            if(i%j==0){
                tedadmakhsom++;
              
            }
                        
        }
        if (i>1&& tedadmakhsom==2){
            System.out.print("aval");
        }
        else{
             System.out.print("aval nist");
        }
        
        if(tedadmakhsom !=2){
            for (int j=2;j<i;j++){
            if (i%j==0){
                System.out.println(j);
            }
        }
        }
        
        int tedad=0;
        for(int x=1;x<=i;x++){
            if(i%x==0){
                tedad++;
            }
            
        }
        System.out.println(tedad+"tedad");
        
        int sum = 0;
        for(int j =1 ; j<i;j++){
            if (i%j ==0){
                sum=sum+j;
                
            }
        }
        System.out.println("majmoe makhsom: " + (sum + i));
        if (i>1 && sum == i){
            System.out.println("adad kaml");
        }
        else{
              System.out.println("adad kaml nist");
        }
    }
}
