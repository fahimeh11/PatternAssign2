/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.za.tutorial.ga;

import java.util.Random;

/**
 *
 * @author fahimeh
 */
public class Chromosom {
    /*private int[] genes; // position of chromosoms, int array representing thos genes
    //the constructor that takes in the genes and instatiates that array given lenghts 
    public Chromosom (int lenght){
        genes = new int[lenght];
    }
    //initialising chromosoms with random zeros and ones
    public Chromosom initializeChromosom(){
        for (int x=0; x < genes.lenght; x++){
            if(Math.random()>= 0.5) genes[x] = 1;
            else genes[x] =0;
        }
        return this;
    }*/
    
    
    

    int fitness = 0;
    int[] genes = new int[5];/////////////////
    int geneLength = 5;

    public Chromosom() {
        Random rn = new Random();

        //Set genes randomly for each individual
        for (int i = 0; i < genes.length; i++) {
            genes[i] = Math.abs(rn.nextInt() % 2);
        }

        fitness = 0;
    }

    //Calculate fitness
    public void calcFitness() {

        fitness = 0;
        for (int i = 0; i < 4; i++) {
            if (genes[i] == 1) {
                ++fitness;
            }
        }
    }

}

    
    
    

