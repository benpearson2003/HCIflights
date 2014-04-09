/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itinerary;

import java.text.DecimalFormat;
import java.util.Comparator;

/**
 *
 * @author bapearson
 */
public class Route implements Comparable<Route>{
    private String airline;
    private String start;
    private String finish;
    private double duration;
    private double price;
    public static int sort;
    
    public int compareTo(Route anotherRoute) throws ClassCastException {
        if (this.sort == 0) {
            if (!(anotherRoute instanceof Route)) {
                throw new ClassCastException("A Route object expected.");
            }
            int anotherRoutePrice = (int) (anotherRoute).getPrice();
            return (int) (this.price - anotherRoutePrice);
        } else {
            if (!(anotherRoute instanceof Route)) {
                throw new ClassCastException("A Route object expected.");
            }
            String anotherRouteAirline = anotherRoute.getAirline();
            return this.airline.compareTo(anotherRouteAirline);
        }
    }
    public Route(){
        DecimalFormat df = new DecimalFormat("#.00");
        String[] airlineNames = {"Delta","Southwest","Virgin"};
        String[] cities = {"San Francisco","Little Rock","Houston","New York","Albuquerque"};
        
        int randomAirlineName = (int)(Math.random()*3);
        airline = airlineNames[randomAirlineName];
        int randomCity = (int)(Math.random()*5);
        start = cities[randomCity];
        randomCity = (int)(Math.random()*5);
        while(start.equals(cities[randomCity]))
            if(randomCity==4)
                randomCity--;
            else
                randomCity++;
        finish = cities[randomCity];
        
        double randomDuration = 1 + Math.random()*8;
        duration = randomDuration;
        duration = (double)Math.round(duration * 100) / 100;
        double randomPrice = 60.0 + Math.random()*140.0;
        price = randomPrice;
        price = (double)Math.round(price * 100) / 100;
    }
    public void setAirline(String A){
        airline=A;
    }
    public void setStart(String S){
        start = S;
    }
    public void setFinish(String F){
        finish = F;
    }
    public void setDuration(double D){
        duration = D;
    }
    public void setPrice(double P){
        price = P;
    }
    
    public String getAirline(){
        return airline;
    }
    public String getStart(){
        return start;
    }
    public String getFinish(){
        return finish;
    }
    public double getDuration(){
        return duration;
    }
    public double getPrice(){
        return price;
    }
}
