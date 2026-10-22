
package com.mycompany.jammagadirmatristamrin7;

public class Jammagadirmatristamrin7 {

    public static void main(String[] args) {
        int[][] a = {
            {3,2,1},
            {6,5,4},
            {9,8,7}
        };
         
        for(int j =0;j<3 ;j++){
           int sum = 0;
            for (int i =0 ; i<3; i++){
                sum=sum + a[i][j];
            }
                System.out.println("jam ston"+ (j+1)+"="+sum);

        }

     
        
        
        
        
        
        
        
        
        
        
    }
}
