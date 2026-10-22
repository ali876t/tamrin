package com.mycompany.determinantamrin9;
import java.util.Scanner;
public class Determinantamrin9 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("adad a detrminan matris vardkonid");
        int a= input.nextInt();
         System.out.println("adad b detrminan matris vardkonid");
        int b= input.nextInt();
         System.out.println("adad c detrminan matris vardkonid");
        int c= input.nextInt();
         System.out.println("adad d detrminan matris vardkonid");
         int d= input.nextInt();
        int detrminan= (a*d)-(b*c);
         System.out.println("javab detrminan");
        System.out.println(detrminan);
        
       
    }
}
