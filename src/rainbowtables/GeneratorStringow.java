/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainbowtables;

import java.util.Random;

/**
 *
 * @author Tobiasz
 */
public class GeneratorStringow {
    private boolean smallAlpha, bigAlpha, numeric;
    private final char[] smallAlphaList, bigAlphaList, numericList;
    private int size; 
    private final Random generator;
    
    public GeneratorStringow(){
        this.generator = new Random();
        this.smallAlphaList = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                                            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w', 'x', 'y', 'z'};
        this.bigAlphaList = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I','J', 'K', 'L', 'M',
                                            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'W', 'X', 'Y', 'Z'};
        this.numericList = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', };
        this.numeric = false;
        this.bigAlpha = false;
        this.smallAlpha = false;
        this.size = 5;
    }
    
    private char generateChar(){
        
       while(true){
       int x = generator.nextInt(3);
       switch(x){
           case 0:
               if(smallAlpha){
                    return smallAlphaList[generator.nextInt(26)];
               }
           case 1:
               if(bigAlpha){
                    return bigAlphaList[generator.nextInt(26)];
               }
           case 2:
               if(numeric){
                    return numericList[generator.nextInt(10)];
               }    
            }
        }
   }
    
    public String generateString(){
        String wynik = "";
        for(int i = 0; i < this.size; i++){
            wynik = wynik+generateChar();
        }
        return wynik;
    }

    public String generateString(String hash){
        
        return null;
    }
    
    void setFlagSmallAlpha() {
       smallAlpha = true;
    }

    void setFlagBigAlpha() {
       bigAlpha = true;
    }

    void setFlagNumerics() {
        numeric = true;
    }

    void setSize(int size) {
        this.size = size;
    }
    
    int getSize(){
        return size;
    }
}