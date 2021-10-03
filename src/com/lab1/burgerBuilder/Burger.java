package com.lab1.burgerBuilder;

public class Burger
{
    //All final attributes
    private final String bun; // required
    private final String sauce; // required
    private final String meat; // required
    private final String[] vegetables; // optional
    private final String cheese; // optional


    private Burger(BurgerBuilder builder) {
        this.bun = builder.bun;
        this.sauce = builder.sauce;
        this.meat = builder.meat;
        this.vegetables = builder.vegetables;
        this.cheese = builder.cheese;
    }

    public String getBun() {
        return bun;
    }
    public String getSauce() {
        return sauce;
    }
    public String getMeat() {
        return meat;
    }
    public String[] getVegetables() {
        return vegetables;
    }
    public String getCheese() {
        return cheese;
    }

    @Override
    public String toString() {
        return "Burger: "+this.bun+", "+this.sauce+", "+this.meat+", "+this.vegetables+", "+this.cheese;
    }
    public static class BurgerBuilder
    {
        private final String bun; // required
        private final String sauce; // required
        private final String meat; // required
        private String[] vegetables; // optional
        private  String cheese; // optional

        public BurgerBuilder(String bun, String sauce,String meat) {
            this.bun = bun;
            this.sauce = sauce;
            this.meat = meat;
        }
        public BurgerBuilder vegetables(String [] vegetables) {
            this.vegetables = vegetables;
            return this;
        }
        public BurgerBuilder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Burger build() {
            Burger burger =  new Burger(this);
            return burger;
        }

    }

}
