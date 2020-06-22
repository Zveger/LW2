/*
 * BottledBeer
 *
 * Version 1
 *
 * Herman Zviertsev, KhPI
 * Choose a subject according to your number. Develop a service using all your best in OOP and Java collections.
   Six methods must be written like in the following example. A point for each one.
 */
package com.company;

import java.util.Objects;

public class BottledBeer implements IProfit {
    private int id;
    private double price;
    private double primeCost;
    private int numberOfSolds;

// Constructors

    public BottledBeer() {
    }

    public BottledBeer(int id, double price, double primeCost, int numberOfSolds) {
        this.id = id;
        this.price = price;
        this.primeCost = primeCost;
        this.numberOfSolds = numberOfSolds;
    }
// Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrimeCost() {
        return primeCost;
    }

    public void setPrimeCost(double primeCost) {
        this.primeCost = primeCost;
    }

    public int getNumberOfSolds() {
        return numberOfSolds;
    }

    public void setNumberOfSolds(int numberOfSolds) {
        this.numberOfSolds = numberOfSolds;
    }

// toString method

    @Override
    public String toString() {
        return "BottledBeer{" +
                "id=" + id +
                ", price=" + price +
                ", primeCost=" + primeCost +
                ", numberOfSolds=" + numberOfSolds +
                '}';
    }

// Equals method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BottledBeer)) return false;
        BottledBeer that = (BottledBeer) o;
        return getId() == that.getId();
    }

// hashCode method

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

// Implemented method from IProfit
    @Override
    public double getProfitFromSales() {
        return this.numberOfSolds * (this.price - this.primeCost);
    }
}
