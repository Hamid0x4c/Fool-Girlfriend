/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.h76.hamid;

/**
 *
 * @author A.I
 */
public class Bitcoin {
    private double USD;
    
    public Bitcoin(double price) {
        this.USD = price;
    }
    
    public double getPrice() {
        return this.USD;
    }
    
    public void setPrice(double price) {
        this.USD = price;
    }
    
    public String toString() {
        return "Bitcoin Price in USD: " + this.USD;
    }
}
