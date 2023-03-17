package org.example;

public class Game {

    private int gameId;
    private String name;
    private double price;
    private double priceAfterDiscpunt;
    public Game(int gameId, String name, double price) {
        this.gameId = gameId;
        this.name = name;
        this.price = price;
    }

    public Game(int gameId, String name, double price, double priceAfterDiscpunt) {
        this.gameId = gameId;
        this.name = name;
        this.price = price;
        this.priceAfterDiscpunt = priceAfterDiscpunt;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceAfterDiscpunt() {
        return priceAfterDiscpunt;
    }

    public void setPriceAfterDiscpunt(double priceAfterDiscpunt) {
        this.priceAfterDiscpunt = priceAfterDiscpunt;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameId=" + gameId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", priceAfterDiscpunt=" + priceAfterDiscpunt +
                '}';
    }
}
