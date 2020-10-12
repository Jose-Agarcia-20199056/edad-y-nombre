/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;
/**
 *
 * @author ginag
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaracion de variables
        int num1,num2,sum,res,mult,menu;
        double divi;
        //aqui capturaremos los datos de nuestro telcado
        Scanner pantalla = new Scanner(System.in);
        // mostrando texto de salida
        System.out.print("Digite su primer numero: ");
        //varible que guarda los datos ingresados
        num1 = pantalla.nextInt();
        System.out.print("Digite su segundo numero: ");
        num2 = pantalla.nextInt();
        //menu para eleijer opciones para operaciones de los numeros
      System.out.print("Elija 1.cerrar_progama,2._Suma,3._Resta,4._Multiplicacion,5_Division: ");
        menu = pantalla.nextInt();
        // operaciones y sus resultados por pantalla 
       switch(menu){
    
           case 1:
             System.exit(0);
           break;
           case 2:
           sum = num1+num2;
           System.out.print("El resultado de la suma es : "+sum);
           break;
           case 3:
            res = num1-num2;
           System.out.print("El resultado de la resta es : "+res);
           break;
           case 4:
            mult = num1*num2;
           System.out.print("El resultado de la multiplicacion es : "+mult);
           break;
           case 5:
           divi = num1/num2;
           System.out.print("El resultado de la division es: "+divi);
           break;    
           
           
           
               
    }
    }
    
}