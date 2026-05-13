package com.pluralsight.Finance;

public class Gold extends FixedAsset{
    private double weight;

    public Gold(String name, double value, double weight) {
        super(name, value);
        this.weight = weight;
    }

    public void Gold(double weight) {

    }

    @Override
    public double getValue() {
        return 0;
    }
}
