/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.danielmarais;

/**
 *
 * @author hp i5
 */
public class Gamer {
    private String name;
    private int a,b;
    
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name= name;
    }
        public int getA(){
            return a;
        }
        public void setA(int a){
            this.a=a;
        }
        public int getB(){
            return b;
        }
        public void setB(int b){
            this.b=b;
        }

    @Override
    public String toString() {
        return "Gamer{" + "name=" + name + ", a=" + a + ", b=" + b + '}';
    }
     



}
