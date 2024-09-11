package com.example.discountcalculation;

public class DiscountCalculator {
    private double originalPrice;
    private double discountRate;
    private double discountAmount;
    private double finalPrice;

    public DiscountCalculator(double originalPrice, double discountRate) {
        this.originalPrice = originalPrice;
        this.discountRate = discountRate;
        calculateDiscountAmount();
        calculateFinalPrice();
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
        calculateDiscountAmount();
        calculateFinalPrice();
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
        calculateDiscountAmount();
        calculateFinalPrice();
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    private void calculateDiscountAmount() {
        this.discountAmount = originalPrice * (discountRate / 100);
    }

    private void calculateFinalPrice() {
        this.finalPrice = originalPrice - discountAmount;
    }

    @Override
    public String toString() {
        return "Original Price: ₹" + originalPrice + "\n" +
               "Discount Rate: " + discountRate + "%\n" +
               "Discount Amount: ₹" + discountAmount + "\n" +
               "Final Price: ₹" + finalPrice;
    }
}
