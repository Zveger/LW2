/*
 * Main
 *
 * Version 1
 *
 * Herman Zviertsev, KhPI
 * Choose a subject according to your number. Develop a service using all your best in OOP and Java collections.
   Six methods must be written like in the following example. A point for each one.
 */
package com.company;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Creating Objects

public class Main {
    public static void main(String[] args) {
        BottledBeer sale1 = new BottledBeer(1,35.0,11.0,12);
        BottledBeer sale2 = new BottledBeer(2,36.0,12.0,10);
        BottledBeer sale3 = new BottledBeer(3,37.0,13.0,11);
        BottledBeer sale4 = new BottledBeer(4,38.0,14.0,15);
        BottledBeer sale5 = new BottledBeer(5,39.0,15.0,17);
        DraftBeer sale6 = new DraftBeer(1.0,7.0,25.0,22.0,5);
        DraftBeer sale7 = new DraftBeer(2.0,8.0,29.0,22.0,6);
        DraftBeer sale8 = new DraftBeer(3.0,9.0,30.0,22.0,8);
        DraftBeer sale9 = new DraftBeer(4.0,10.0,33.0,22.0,10);
        DraftBeer sale10 = new DraftBeer(5.0,12.0,37.0,22.0,15);

// Creating List

        List<IProfit> allSales = new ArrayList<>();
        allSales.add(sale1);
        allSales.add(sale2);
        allSales.add(sale3);
        allSales.add(sale4);
        allSales.add(sale5);
        allSales.add(sale6);
        allSales.add(sale7);
        allSales.add(sale8);
        allSales.add(sale9);
        allSales.add(sale10);

// Sales Profit Calculation

        double profitFromSales = allSales.stream().mapToDouble(IProfit::getProfitFromSales).sum();
        IProfit minimumProfitOfSales = allSales.stream().

// Minimal Profit Calculation

                min(Comparator.comparing(IProfit::getProfitFromSales)).orElse(null);
        IProfit maximumProfitOfSales = allSales.stream().

// Maximal Profit Calculation

                max(Comparator.comparing(IProfit::getProfitFromSales)).orElse(null);

// Average Profit Calculation
        
        double avg  = allSales.stream().mapToDouble(IProfit::getProfitFromSales)
                .average().orElse(0);

// Bottle Beer Calculation

        double profitFromBottleBeer = allSales.stream().filter(el -> el instanceof BottledBeer)
                .mapToDouble(IProfit::getProfitFromSales).sum();

// Draft Beer Calculation

        double profitFromDraftBeer = allSales.stream().filter(el -> el instanceof DraftBeer)
                .mapToDouble(IProfit::getProfitFromSales).sum();

// Beer Comparison

        if( profitFromBottleBeer> profitFromDraftBeer){
            System.out.println("Profit from sales bottle beer is higher than from draft beer");
        }
        else {
            System.out.println("Profit from sales draft beer is higher than from bottle beer");
        }
    }
}
