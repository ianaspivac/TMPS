package com.lab1.pizzaFactory;

public class Pizza {
    public abstract class Pizza {

        public abstract String getChicken();

        public abstract String getSalami();

        public abstract String getTomatoes();

        public abstract String getOnion();

        public abstract String getMushrooms();

        public abstract String getSpicyPepper();

        public abstract String getOlives();

        public abstract String getBellPepper();

        @Override
        public String toString() {
            return this.getChicken() + ", " + this.getSalami() + ", " + this.getTomatoes() + "," + this.getOnion() + "," + this.getMushrooms() + "," + this.getSpicyPepper() + "," + this.getBellPepper() + "," + this.getOlives();
        }
    }
}
