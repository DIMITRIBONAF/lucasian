

package com.mycompany.pruebatecnicalucasian;

import java.util.Scanner;

public class Pruebatecnicalucasian {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite el nombre");
        String name =sc.next();
        
        System.out.println("Digite el valor de su compra");
        Float valueToBought = sc.nextFloat();
        
        Float porcent = 0.0f;
        
        if (valueToBought >= 200000) porcent =15.0f;
        else if (valueToBought >= 50000)porcent = 2.0f;
        else if(valueToBought >= 15000) porcent = 1.5f;
        
            
        
       System.out.println (preintBill( name,valueToBought, porcent));
    }
    
    public static String preintBill(String name, float valueToBought, float porcentDisacount)
    {
        Float finalToBought = (valueToBought * porcentDisacount) / 100;
        finalToBought = valueToBought - finalToBought;
        
        String cheking = """
                System lucasian labs Restaurant
            
            Nombre: %s
            Valor de la compra: %.2f
            Porcentaje de descuento: %.1f %%
            %s
            Valor a pagar: %.2f
                         
            *** Agradecemos por su compra  %s ***
         """.formatted(name, valueToBought, porcentDisacount ,"__".repeat(30), finalToBought, name);
        
        return cheking;
    }
}
