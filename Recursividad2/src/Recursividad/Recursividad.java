/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;
import javax.swing.*;
public class Recursividad {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       recur ciclo = new recur();
       
       int fact, opcion ;
       
          do
     {
      
       opcion = Integer.parseInt(JOptionPane.showInputDialog(null ,
               "1. Suma de N numero metodo RECURSIVO \n"
             + "2. Factorial ciclo FOR \n"
             + "3. Factorial RECURSIVO  \n"   
             + "4. Fibonacci ciclo FOR \n"  
             + "5. Fibonacci RECURSIVO \n"         
             + "6. Salir", " Menu de Opciones",3));
       
       switch (opcion){
        
           case 1:
                    fact  = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Numero: "));
                    JOptionPane.showMessageDialog(null, ciclo.sumarecursiva(fact));
           break;
           
           case 2:
                   fact  = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Numero: "));
                   JOptionPane.showMessageDialog(null, ciclo.factorialciclo(fact));
           break;
                 
           case 3:
                   fact  = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Numero: "));
                   JOptionPane.showMessageDialog(null, ciclo.factorialrecursivo(fact));
           break;
           
           
           case 4:
                fact  = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Numero: "));
                int a=0 , b=1;
                 for (int i = 0; i <= fact; i++) {
                   System.out.println("Fibonacci de  " + i + "  es:  " + a );
                    a = a + b;
                    b = a - b;
                }
               
           break;
           
           case 5:
               
              
           break;
           
           case 6:
               JOptionPane.showMessageDialog(null, "Aplicacion Finalizada");
           break;
           
           default:
               JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
          
       }
       
    } while (opcion != 6);
              
   

}
}
