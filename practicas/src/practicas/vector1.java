/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import java.util.Scanner;

/**
 *
 * @author JOHAN
 */
public class vector1 {
    
    public static void main(String[] args){
        
             int Numbers[] = new int[10],i=0;
        String Names[] = new String[10];
        
        // insert vectores data
        Numbers[0]=10;
        Names[0]="peter";
        Names[1]="juan";
        Names[2]="pedro";
        Names[3]="felipe";
        Names[4]="andres";
        Names[5]="sebas";
        Names[6]="johan";
        Names[7]="jose";
        Names[8]="alejandra";
        Names[9]="monica";
        
        System.out.println("the values at index 0 is   "+Numbers[0]);
        System.out.println("the values at index 0 is   "+Names[0]);
        System.out.println("the values at index 0 is   "+Names.length);
        
        
        for(i=0;i<Names.length;i++){
            
             System.out.println("Name "+ (i+1)+ (", ") + Names[i]); 
        

        }
            
            
           //sumar el numero ultimo con el antepennultim.
          /* Scanner escribir = new Scanner(System.in);
           
           int lista[] = new int [10];
           
           int num,i,lim=0,res;
           
           
            System.out.println("Ingrese un numero;");
            for(i=0;i<=lista[0];i++){
            lista[0]=9;   
            num = escribir.nextInt();
            
            }
                
                if (i<lista[i]){
                    
                    res = i+lista[i];
                    System.out.println("la suma"+res); 
                    
                }*/
           
           
            
            
    
    }
}