/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author ASUS TUF
 */
public class CalculateBillImplementation implements CalculateBill {
    
    
           int space;
           int duration;
           int total;
           int pay;
           int balance;

    @Override
    public int calculateBill(int space , int duration , int total) {
        
        
       
         int a=0;
         int b=0;
        
             
             if(space < 10 ){
                 a=10;             
            }else if(space > 10 && space <20 ){                 
                 a=15;                
             }else{                
                 a=20;
             }
             
             
         if(duration < 10 ){
             b=10;         
            }else if(duration > 10 && duration <20 ){
                 b=15;
             }else{
                 b=20;
             }
         
     total = (space * a)+ (duration * b);
             
                return total;
        
        
    }

    @Override
    public int balance(int total, int pay, int balance) {
        
        
        balance = (pay - total);
        
        return balance;
    }
    
}





