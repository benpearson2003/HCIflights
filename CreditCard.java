/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itinerary;

/**
 *
 * @author pxtanthaphen
 */
public class CreditCard {
    private String ccNumber;
    private String name;
    private String cvc;
    private String expiration;
    private String airlineName;


    public CreditCard() {
        ccNumber = "";
        name = "";
        cvc = "";
        expiration = "";
        airlineName = "";
    }
    
    public CreditCard(String A, String B, String C, String D, String E) {
        name = A;
        ccNumber = B;
        cvc = C;
        expiration = D;
        airlineName = E;
    }
    
    public void setCcNumber(String n){
        ccNumber = n;
    }
    public void setName(String n){
        name = n;
    }
    public void setCvc(String n){
        cvc = n;
    }
    public void setExpiration(String n){
        expiration = n;
    }
    public void setAirlineName(String n){
        airlineName = n;
    }
    
    public String getCcNumber(){
        return ccNumber;
    }
    public String getName(){
        return name;
    }
    public String getCvc(){
        return cvc;
    }
    public String getExpiration(){
        return expiration;
    }
    
    public String getAirlineName(){
        return airlineName;
    }
}
