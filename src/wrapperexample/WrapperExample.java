/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperexample;

/**
 *
 * @author class
 */
public class WrapperExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       String sInt,sDouble;
       sInt=args[0];
       sDouble=args[1];
       System.out.println(sInt);
       System.out.println(sDouble);
       System.out.println(sInt + sDouble);
     int num=Integer.parseInt(sInt);
     double digit=Double.parseDouble(sDouble);
     double sum=num+digit;
    System.out.println(num+digit);
    
    String s2=Double.toString(sum);
    System.out.println(s2+5);
    
    
    System.out.println( 2 + 5 + "" + 5);
        String name="fred";
    }
    
}
