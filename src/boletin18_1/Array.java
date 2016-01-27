/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_1;

import javax.swing.JOptionPane;

/**
 *
 * @author igonzalezcastro
 */
public class Array {

    int[] numeros = new int[6];

    
        public void crearArray(){
           for (int i = 0; i < numeros.length; i++) {
           numeros[i] = (int) (Math.random() * 50 + 1);
           System.out.println(numeros[i]);
              
        } }
        
        public void visualizarArray(){
        for(int i=numeros.length-1;i>=0;i--){
        System.out.println(numeros[i]);
        } }
        }

