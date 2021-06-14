

package com.company;

public enum Fuel {
    GAS(0.90),
    DIESEL(1.90),
    ELECTROSITY(0.20),
    GASOLINE95(1.90),
    GASOLINE92(1.80);

    private String isEcoFriendly;
    private double costFuelLitr;
    private double price;


    public double getCostFuelLitr() {
        return costFuelLitr;
    }

    Fuel(double costFuelLitr) {
        this.costFuelLitr = costFuelLitr;
        price = costFuelLitr;

    }

    private void isEcoFriendly(String isEcoFriendly) {
        this.isEcoFriendly = isEcoFriendly;
    }

    /** Class enum - не может быть абстрактным, не может быть унаследован,не используется new,
     не может быть подклассом и супер классом,конструктор всегда private, поля рекомендуется делать final*/
}


