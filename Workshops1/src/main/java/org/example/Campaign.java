package org.example;

public class Campaign{

    private int id;
    private  User gamer;
    private Game games;
    private double discount;

    public Campaign(int id, User gamer, Game games, double discount) {
        this.id = id;
        this.gamer = gamer;
        this.games = games;
        this.games.setPriceAfterDiscpunt(games.getPrice()*(100-discount)/100);
        this.discount = discount;
    }

    public Campaign() {
    }

    public User getGamer() {
        return gamer;
    }

    public void setGamer(Gamer gamer) {
        this.gamer = gamer;
    }

    public Game getGames() {
        return games;
    }

    public void setGames(Game games) {
        this.games = games;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGamer(User gamer) {
        this.gamer = gamer;
    }
}
