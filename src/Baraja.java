
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Baraja {
  
   String Palo []= {"Trebol","Corazon","Pica","Diamante"};
   String Numero []= {"Az","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","Jack","Queen","King"};
   Carta miscartas[][] =new Carta[1][13]; 
   void CrearBaraja(){
       int Contador=0;
       for (int i =0;i<4;i++){
           for(int j=0 ; j<13 ;j++){
            
    miscartas [i][j]=new Carta();
    miscartas [i][j].numero=Numero[j];
    miscartas [i][j].palos=Palo[i];
    Contador ++;
           }  
   }    
   }
   
  void Barajar(){
      Random miRandom =new Random();
      int x=0;
      
      int azar=miRandom.nextInt(13170);
      while(x<azar){
     int posicionInicial=miRandom(52); 
     int posicionFinal=miRandom(52);
     
     Carta miCarta[]=new Carta [posicionInicial];
     miCarta[posicionInicial]=miCarta[posicionFinal];
     miCarta[posicionFinal] =miCarta[azar];
     }
   
     
     
     
    
     
  
      
  }

    private int miRandom(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
   
   
}
