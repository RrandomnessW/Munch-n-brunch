/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package munch.n.brunch;

import java.util.Scanner;

/**
 *
 * @author ryanj
 */
public class MunchNBrunch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int[] price=new int[10];
        double[][] percent=new double[10][4];
        int[] no=new int[10];
        String[] decision=new String[10];
        double temp;
        
        for(int i=0;i<10;i++){
            price[i]=sc.nextInt();
            for (int j=0;j<4;j++){
                percent[i][j]=sc.nextDouble();
            }
            no[i]=sc.nextInt();
            
            temp=percent[i][0]*no[i]*12;//percent x number of student x money, add them all together to compare with the price.
            temp+=percent[i][1]*no[i]*10;
            temp+=percent[i][2]*no[i]*7;
            temp+=percent[i][3]*no[i]*5;
            
            if(temp>=price[i]){
                decision[i]="no";
            } else{
                decision[i]="yes";
            }
        }
        
        for(int i =0;i<10;i++){
            System.out.println(decision[i]);
        }
    }
    
}
