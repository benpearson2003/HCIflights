/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itinerary;

/**
 *
 * @author bapearson
 */
public class Account {
    private String airlineName;
    private String username;
    private String password;
   
    public Account(){
       username = "";
       password = "";
       airlineName = "";
       
    }
    
    public Account(String A, String B, String C){
       username = A;
       password = B;
       airlineName = C;
       
    }
    
    public void setAirlineName(String A){
        airlineName = A;
        
    }
    public void setUsername(String B){
        username = B;
        
    }
    public void setPassword(String C){
        password = C;
        
    }
    
    public String getAirlineName(){
        return airlineName;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    
}
