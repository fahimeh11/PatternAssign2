/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga;

/**
 *
 * @author fahimeh
 */
import java.util.Arrays;
public class Individuals {
    
   private int [] chromosme;
   private int fitness = 0;
    
   
   //initializing chromosomes
   public Individuals(int [] chromosome){
   this.chromosme = chromosome;
   }
  // initilizing random chromosomes with 0s and 1s
   public Individuals(int chromosmeLength){
   this.chromosme = new int [chromosmeLength];
      for (int gene = 0; gene <= chromosmeLength; gene++){
        if (0.5 < Math.random()) {
				chromosme[gene] = 1;
			} else {
				chromosme[gene] = 0;
			}
      }
     
   }
   //getting and returining the individuals chromosome
   public int [] getchromosome(){
   return this.chromosme;
   }
   //getting and returing the chromosome length
   public int getChromosomeLength(){
   return this.chromosme.length;
   }
   public int getFitness(){
   return this. fitness;
   }
   
   //displayying the chromosome as string
   public String toString() {
		String output = "";
		for (int i = 0; i < this.chromosme.length; i++) {
			output += this.chromosme[i];
		}
		return output;
	}
}
