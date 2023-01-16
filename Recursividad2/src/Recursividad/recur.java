/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author Andrea
 */
public class recur {
    
    
    
  
    
    
public int sumarecursiva(int n){
     
    if (n==0){
        return 0;
    }
    return n + sumarecursiva(n-1);
  }
    
    
    
    
    
    
    
    
 public int factorialciclo(int n){
    int factorial = 1;
  for(int f = n ; f >= 1 ; f--)
    {
     factorial = f * factorial;
    }
     return factorial;
 }

 
 
 
 
 
 
 
 
public int factorialrecursivo(int n){
      
    if (n==0){
        return 1;
    }
    return n * factorialrecursivo(n-1);
  }



}
