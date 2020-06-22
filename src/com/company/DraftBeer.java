/*
 * DraftBeer
 *
 * Version 1
 *
 * Herman Zviertsev, KhPI
 * Choose a subject according to your number. Develop a service using all your best in OOP and Java collections.
   Six methods must be written like in the following example. A point for each one.
 */
package com.company;

import java.util.Objects;

public class DraftBeer implements IProfit {
    private double tarePrimePrice;
    private double tareCost;
    private double beerCost;
    private double beerPrimeCost;
    private double litersOfBeer;

// Constructors

    public DraftBeer() {
    }

    public DraftBeer(double tarePrimePrice, double tareCost, double beerCost, double beerPrimeCost, double litersOfBeer) {
        this.tarePrimePrice = tarePrimePrice;
        this.tareCost = tareCost;
        this.beerCost = beerCost;
        this.beerPrimeCost = beerPrimeCost;
        this.litersOfBeer = litersOfBeer;
    }

// Getters and Setters

    public double getTarePrimePrice() {
        return tarePrimePrice;
    }

    public void setTarePrimePrice(double tarePrimePrice) {
        this.tarePrimePrice = tarePrimePrice;
    }

    public double getTareCost() {
        return tareCost;
    }

    public void setTareCost(double tareCost) {
        this.tareCost = tareCost;
    }

    public double getBeerCost() {
        return beerCost;
    }

    public void setBeerCost(double beerCost) {
        this.beerCost = beerCost;
    }

    public double getBeerPrimeCost() {
        return beerPrimeCost;
    }

    public void setBeerPrimeCost(double beerPrimeCost) {
        this.beerPrimeCost = beerPrimeCost;
    }

    public double getLitersOfBeer() {
        return litersOfBeer;
    }

    public void setLitersOfBeer(double litersOfBeer) {
        this.litersOfBeer = litersOfBeer;
    }

// Equals method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DraftBeer)) return false;
        DraftBeer draftBeer = (DraftBeer) o;
        return Double.compare(draftBeer.getTarePrimePrice(), getTarePrimePrice()) == 0;
    }

// HashCode method

    @Override
    public int hashCode() {
        return Objects.hash(getTarePrimePrice());
    }

// toString method

    @Override
    public String toString() {
        return "DraftBeer{" +
                "tarePrimePrice=" + tarePrimePrice +
                ", tareCost=" + tareCost +
                ", beerCost=" + beerCost +
                ", beerPrimeCost=" + beerPrimeCost +
                ", litersOfBeer=" + litersOfBeer +
                '}';
    }

// Implemented method from IProfit

    @Override
    public double getProfitFromSales() {
        return this.litersOfBeer*(this.beerCost - this.beerPrimeCost
                + this.tareCost - this.tarePrimePrice);
    }
}
