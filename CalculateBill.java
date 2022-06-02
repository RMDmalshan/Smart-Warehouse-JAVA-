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
public interface CalculateBill {
    
    public int calculateBill(int space , int duration, int total);
    
    public int balance(int total , int pay , int balance);
    
}
