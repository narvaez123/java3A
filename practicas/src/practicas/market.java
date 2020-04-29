/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import java.util.ArrayList;

/**
 *
 * @author JOHAN
 */
public class market {
    
    /**
     *
     * @param args
     */
    
    public static void main(String[] args){
         ArrayList<String> cars = new ArrayList<String>();
       cars.add("Chevrolet");//0
       cars.add("mazda");// 1
       cars.add("nissan");// 2
       cars.add("zusuki");// 3
       cars.add("yamaha");// 4
       cars.add("foton");// 5
       
       
       System.out.println(cars);
        
       for (int i=1;i<cars.size();i++){
           System.out.println(cars.get(i));
       }
       
       
       
       /*System.out.println(cars);
       System.out.println(cars.get(2));
       String old_cars = cars.get(2);
       cars.set(2, "nisan march");
       System.out.println(old_cars + "  is now: " + cars.get(2) );
       cars.remove(1);
       System.out.println(cars);
       System.out.println(cars.get(1));
       System.out.println("el tamoño de los coches es: " + cars.size());
       cars.clear();
       System.out.println(cars);*/
    
    
    }
}
